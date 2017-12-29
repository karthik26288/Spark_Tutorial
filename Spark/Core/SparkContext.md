## SparkContext

* SparkContext is the main entry point for Spark functionality.
* SparkContext represents the connection to a Spark cluster to get the cluster resources.
* SparkContext is used to create RDDs, accumulators and broadcast variables on that cluster.
* Only one SparkContext may be active per JVM. You must stop() the active SparkContext before creating a new one.
* Every Spark Application contains one SparkContext object. This SparkContext object can manage one or more jobs under single Spark Application.

#### The following are methods and constructors associated with SparkContext
```
Constructors:
  * SparkContext() - All defaults
  * SparkContext(sparkConf) - Defaults + overriden values
  * SparkContext(master, appName, sparkConf) -- Defaults + overriden values + appName and spark master
  
Methods:

  * addFile(String path)
      Add a file to be downloaded with this Spark job on every node.
  * addFile(String path, boolean recursive)
      Add a file to be downloaded with this Spark job on every node. Here path is directory.
      
  
```
