## Spark Cluster Managers

* Apache Spark runs in five cluster managers
  * Local
  * Standalone
  * Yarn
  * Mesos
  * Kubernetes(experimental)

* All three standalone, Yarn and Mesos modes are distributed environment. In distributed environment, resource management is very import to manage the computing resources. So to manage computing resources in efficient way, we need good resource management system or Resource Schedular.

* Standalone is good for small spark clusters, but it is not good for bigger clusters (There is an overhead of running spark daemons(master + slave) in cluster nodes). These daemons require dedicated resources. So standalone is not recommended for bigger production clusters.

* In case of YARN and Mesos mode, Spark runs as an application and there are no daemons overhead. So We can use either YARN or Mesos for better performance and Scalability.

* In between YARN and Mesos, it is better to use YARN if you have already running Hadoop cluster (Apache/CDH/HDP). In case of a brand new project, better to use Mesos(Apache, Mesosphere). There is also a provision to use both of them in colocated manner using Project called Apache Myriad.

* Out of all three modes, Apache Mesos has better resource management capabilities.

### Local - Cluster Manager:
* Spark runs in Local as cluster Manager i.e., Here spark application runs on top of Operating system natively with one more threads.
