## Spark Overview:

* Apache Spark is a fast and general-purpose distributed cluster computing framework.
* Spark is only computational engine and it doesn't have any storage.
* Spark is an alternative computational paradigm for Hadoop MapReduce.
* Spark was created as a research project in UC Berkeley RAD lab by Matei Zaharia and team.
* Spark eventually moved to UC Berkeley AMP(Algorithms, Machines, People) lab and finally open sourced under Apache.
* Spark is one of the top level projects under Apache Software Foundatation.
* Spark is lambda architecture i.e., batch and realtime
* Spark is much faster than MapReduce i.e., 100X faster than at memory level and 10X faster than at disk level.
* Spark is multi purpose i.e., it supports various workloads like ETL, SQL, Machine Learning, Graph Processing, Stream Processing etc...
* Spark provides high-level APIs in Java, Scala, Python and R, and an optimized engine that supports general execution graphs.
* Spark has vibrant community.
* Spark has good number of Higher level abstractions:
  * Spark SQL for SQL and structured data processing
  * MLlib for machine learning
  * GraphX for graph processing
  * Spark Streaming
  * Structed Stream processing
* Spark is well integrated with popular storage systems
  * HDFS
  * Local
  * Cassandra
  * HBase
  * S3
  * MongoDB
  * Redis
  * Azure Blob Storage
  * Any Hadoop File Formats
* Spark runs on anywhere
  * Local
  * spark
  * yarn
  * mesos
  * kubernetes
  * Amazon EC2 cloud
* It is easy to use and learn
* Spark is an interactive programming model to do interactive data analysis.
* Spark provides an primary abstraction called resilient distributed dataset (RDD), which is a distributed collection of elements partitioned across the nodes of the cluster that can be operated on in parallel.
* RDDs are created by external datasets like files HDFS or HDFS compatible file systems, or Scala collection in the driver program, and transforming another RDD.
* RDD allows two types of operations like transformations and actions.
* Spark also allows us to persist an RDD in memory, allowing it to be reused efficiently across parallel operations.
* Spark RDDs automatically recover from node failures.
* Spark provides second abstraction is called shared variables that can be used in parallel operations.
* Spark supports two types of shared variables
  * broadcast variables, which can be used to cache a value in memory on all nodes.
  * accumulators, which are variables that are only “added” to, such as counters and sums.
* Spark allows interative data analysis using the following tools:
  * spark-shell : Scala Interactive tool
  * pyspark: Python Interactive tool
  * Notebook: Web-based Interactive tool
  * Zepplein: Another Web-based interactive and visualization tool
  * spark-sql: SQL Ineractive tool
