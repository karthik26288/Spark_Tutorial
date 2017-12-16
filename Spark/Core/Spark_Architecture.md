## Spark Application Architecture

* We can have one or more Spark Applications.
* All Spark applications are independent processes.
* Spark Application executes one or more Spark Jobs.
* Every Spark Application contains the following components.
  * Client
  * Driver
  * SparkContext
  * Cluster Manager
  * Worker Node
  * Executor
  * Job
  * Stage
  * Task

### Client:
* Client is node from which Spark application is submitted.
* Spark application has two deployment modes
  * Client
  * Cluster
* By default, Spark application submission happens in client mode as deployment mode.
* In Client Mode, Spark driver runs on the client machine.
* In Cluster Mode, Spark driver runs on one of the cluster machines.

### Driver:
* For every Spark Application, the driver is entry point i.e., main method.
* Spark Driver holds the SparkContext Object.
* Spark driver runs in client machine by default. We can also run Spark driver in cluster node using deployment mode as cluster.

### SparkContext:
* SparkContext is pivotal for every Spark Application.
* Every Spark Application contains only SparkContext object.
* There is no support multiple SparkContext objects for only Spark application.
* SparkContext coordinates Spark Application.
* SparkContext interacts with Cluster managers to negotiate computing resources.
* SparkContext ineracts with executors to send tasks and cache the data.
* SparkContext runs inside the Spark Driver executor.
* SparkContext must be created before performaing transfromations and actions on RDD.
* SparkContext life span is equal to Spark application life span.
* SparkContext can execute multiple Spark jobs within single Spark application.
* SparkContext is not shared in between two or more Spark applications.

### [Cluster Manager](https://github.com/malli3131/Spark_Tutorial/new/master/Spark/Core)
* In Spark, Cluster Manager is responsible for allocating, scheduling and monitoring computing resources.
* Spark supports five types of Cluster Managers, they are:
  * local - Running on top of native Operating System with one or more threads.
  * spark - Spark Standalone i.e., Spark has its own distributed resource management like YARN to distribute resources among Spark Applications.
  * yarn - Distributed Resource Management system from Apache Hadoop.
  * mesos - Another Distributed resource management system from Apache which is designed as general purpose distributed resource scheduler.
  * kubernetes(experimental) - Kubernetes is an open-source platform for providing container-centric infrastructure. Kubernetes support is being actively developed in an apache-spark-on-k8s Github organization.
* Among the above all, mesos is the most efficient cluster manager.
* Spark allows us to run Spark applications on any one of the above cluster managers.

### Worker Node:
* In Spark, Worker Node is the slave node where we run Spark exector processes.
* In Spark local, worker node is the your local computer.
* In Spark standalone, Spark Worker process.
* In Spark over Mesos, Mesos Agent.
* In Spark over YARN, Node Manager.
* Worker Node, runs one or more spark executors of one more Spark applications.
* We can have one or more Spark worker nodes per cluster.
* Worker Node should have sufficient storage, cpu, memory etc...
* Worker Node failures are handled by Spark fault tolerance i.e., worker node failure doesn't cause job or application failure.

### Executor:
* Executor is worker nodes' process in charge of running one or more tasks in a given Spark job.
* Executors are launched at the beginning of a Spark application and typically run for the entire lifetime of an application. * Executors run the task they send the results to the driver.
* Executors also provide in-memory storage for RDDs that are cached by user programs through Block Manager.
* Executors interact with SparkContext for receiving tasks and send the results back.
* Executors are linked to SparkContext object.
* Executors which lost connection to SparkContext object are called orphaned executors.

### Job:
* In Spark Application, we can execute one or more Spark jobs.
* Every Action on Spark RDD in Spark application will kick one Spark Job.
* In Spark, Job is a DAG of tasks which are staged in multiple stages.

### Stage:
* In Spark, Stage is collection of similar tasks are executed for operations like map, filter, etc...
* A stage is a set of parallel tasks — one task per partition

### Task:
* In Spark, Task is a unit of compuatation.
* The input for task is partition i.e., it takes partition as input, performs transformations, produces partition as output.

### Spark Application Execution Flow:

* Spark application starts and instantiates a SparkContext instance in Driver program.
* The driver program ask for resources to the cluster manager to launch executors.
* The cluster manager launches executors.
* The driver process runs through the user application. Depending on the actions and transformations over RDDs task are sent to executors.
* Executors run the tasks and save the results.
* If any worker crashes, its tasks will be sent to different executors to be processed again i.e., fault tolerance.
* Spark automatically deals with failed or slow machines by re-executing failed or slow tasks. For example, if the node running a partition of a map() operation crashes, Spark will rerun it on another node; and even if the node does not crash but is simply much slower than other nodes, Spark can preemptively launch a “speculative” copy of the task on another node, and take its result if that finishes.
* Use SparkContext.stop() from the driver or if the main method exits/crashes all the executors will be terminated and the cluster resources will be released by the cluster manager.

### The following daigram dipicts the flow of Spark application:



