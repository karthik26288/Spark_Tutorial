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

[### Cluster Manager](https://github.com/malli3131/Spark_Tutorial/new/master/Spark/Core)
* In Spark, Cluster Manager is responsible for allocating, scheduling and monitoring computing resources.
* Spark supports four types of Cluster Managers, they are:
  * local - Running on top of native Operating System with one or more threads.
  * spark - Spark Standalone i.e., Spark has its own distributed resource management like YARN to distribute resources among Spark Applications.
  * yarn - Distributed Resource Management system from Apache Hadoop.
  * mesos - Another Distributed resource management system from Apache which is designed as general purpose distributed resource scheduler.
  
