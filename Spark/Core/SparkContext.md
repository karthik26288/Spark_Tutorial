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
  
Methods for creating RDDs using collection and external datasets:

import org.apache.hadoop.io.{Text, LongWritable, NullWritable}
import org.apache.hadoop.mapreduce.lib.input._

object RDDCreation{
def main(args:Array[String]){
   
   //Text Files
   val data = sc.newAPIHadoopFile("hdfs://master:9000/spark/people", classOf[TextInputFormat], classOf[LongWritable],   classOf[Text])
   val mydata = data.map(record => record._2.toString())
   mydata.collect()
   
   
}
}




val seqData = sc.sequenceFile[Null, String]("hdfs://master:9000/spark/seq_stocks")
val mySeqData = seqData.map(record => record._2.toString())
mySeqData.collect()


val seqData = sc.newAPIHadoopFile("hdfs://master:9000/spark/seq_stocks", classOf[SequenceFileInputFormat[NullWritable,Text]], classOf[NullWritable], classOf[Text])
val mySeqData = seqData.map(record => record._2.toString())
mySeqData.collect()
      
  
```
