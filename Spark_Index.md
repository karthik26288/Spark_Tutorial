* [Bigdata](https://github.com/malli3131/Spark_Tutorial/blob/master/Spark_Index.md)
  * Data
  * Data Growth
  * Data Life Cycle Management
  * Data Vs Bigdata
  * Data properties
  * Data Sources
  * Data Formats
  * Three Vs - Volume, velocity, Variety
* [Distributed Systems](https://github.com/malli3131/Spark_Tutorial/blob/master/Spark_Index.md)
  * Systems
  * Scalability
    * Scale Up - Vertical Scaling/Traditional System
    * Scale Out - Horizontal Scaling/Distributed System
  * Traditional Systems
  * Distributed Systems
  * Traditional Vs Distributed Systems
  * Types of Distributed Systems
    * Computation Intensive - CPU Bound
    * Data Intensive - I/O Bound
      * Realtime - NoSQL and NewSQL
      * Near Realtime - Straming Engines i.e., Storm , Flink, Spark Streaming, Samza etc...
      * Batch - MapReduce, Spark, Flink etc...
* [Hadoop and Hadoop Ecosystem](https://github.com/malli3131/Spark_Tutorial/blob/master/Spark_Index.md)
  * Hadoop Core
    * HDFS - Distributed File System
    * MapReduce - Distributed Processing Engine
    * Yarn - Distributed Resource Management
  * Hadoop Ecosystem
    * Pig - data flow language
    * Hive - Data Warehouse
    * HBase - Database
    * Sqoop - Data Connector
    * Flume - Log collection framework
    * Kafka - Distributed Messaging Queue System
    * Oozie - Workflow Scheduler
    * Sentry - Security
    * Mahout - Machine Learning Framework
    * Imapala - Data Warehouse
    * Ambari - Clutser Management Service
    * Zookeeper - Coordination Service
    * etc...
* [MapReduce Limitations](https://github.com/malli3131/Spark_Tutorial/blob/master/Spark/Core/MapReduce_Limitations.md)
* [Modern Distributed Computational Engines](https://github.com/malli3131/Spark_Tutorial/blob/master/Spark/Core/Computational_engines.md)
* [What is Spark/Why Spark?](https://github.com/malli3131/Spark_Tutorial/blob/master/Spark_Index.md)
* [MapReduce Vs Spark](https://github.com/malli3131/Spark_Tutorial/blob/master/Spark/Core/MapReduce_Spark.md)
* [Spark Overview](https://github.com/malli3131/Spark_Tutorial/blob/master/Spark_Index.md)
  * Introduction
  * Features
    * Speed
    * Ease of Use
    * General
    * Integrations
    * Client APIs
    * Ecosystem
    * Lambda Archiecture
    * Scalable
  * Spark Core
  * Spark Ecosystem
* [Spark Architecture](https://github.com/malli3131/Spark_Tutorial/blob/master/Spark/Core/Spark_Architecture.md)
  * Application
  * Job
  * Driver
  * SparkContext
  * Client
  * WorkerNode
  * Executor
  * Cluster Manager
  * Stage
  * Task
* [Spark Cluster Managers](https://github.com/malli3131/Spark_Tutorial/blob/master/Spark/Core/Cluster_Managers.md)
  * Local
  * Spark
  * Yarn
  * Mesos
  * Kubernetes
* Spark Installation
  * Local Mode
  * Standalone Mode
  * YARN Mode
  * Mesos Mode
* Spark Tools
  * spark-submit
  * spark-shell
  * spark-class
  * spark-sql
  * pyspark
  * sparkR
  * run-example
  * Spark WebUI
  * Spark History Server
  * beeline
*********************************************
## Spark Core
* RDD
  * Overview
  * Partitions
  * Input and Output Formats
  * Creating RDDs
    * Parallel Collections
    * External Datasets i.e., Local, HDFS, Cassandra, HBase, and any Hadoop Input Formats
    * From another RDD by transforming
  * Types RDDs
    * BaseRRDD
    * CoGroupedRDD
    * PairedRDD
    * HadoopRDD
    * JdbcRDD
    * NewHadoopRDD
    * PartitionPruningRDD
    * ShuffledRDD
    * UnionRDD
    * VertexRDD
    * EdgeRDD
  * RDD Operations
    * Transformations
    * Actions
    * Lazy Evaluation
    * Passing Functions
    * Shuffle
    * Key-Value Paired RDDs
    * Data Partitioning
    * Data Joins
  * Saving RDDs
    * Return to a collection
    * Saving into external storage systems like local, HDFS, Cassandra, MongoDB and Any Hadoop output format.
  * RDD Persistance
    * cache
    * persist
    * StorageLevel
* Shared variables
  * Overview
  * Broadcast Variables
  * Accumulators
