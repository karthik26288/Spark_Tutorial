## MapReduce Vs Spark
* MapReduce is a distributed processing engine.
* MapReduce is a popular disk oriented distributed programming model.
* Spark is another fast and general purpose distributed programming model.
* Spark is a modern and an alternative memory oriented distrbiuted processing engine.
* Spark is more general purpose and MapReduce is legacy.

|   |MapReduce              | Spark |
|---|-----------------------|-------|
|1. | MapReduce is legacy    | Spark is general puropse|
|2. | MapReduce is slow      | Spark is fast|
|3. | MapReduce is two staged i.e.. Map and Reduce | Spark is multi staged|
|4. | MapReduce is disk oriented| Spark is memory oriented|
|5. | MapReduce written in Java | Spark is written in Scala|
|6. | MapReduce offers client APIs in Java  | Spark offers clients in Scala, Java, Python and R|
|7. | MapReduce is only Batch | Spark is both Batch and Near Realtime|
|8. | MapReduce not good for Iterative and Expressive computing | Spark is good for Iterative and Expressive computing  |
|9. | MapReduce is DAG of jobs  | Spark is DAG of tasks |
|10.| MapReduce is cheaper and slow | Spark is expensive and faster |
|11.| MapReduce is not productive | Spark is very productive  |
|12.| MapReduce is bit difficult to use | Spark is easy to use  |
|13.| MapReduce is more secured | Spark not well secured  |
|14.| MapReduce is more stable and staturated | Spark is bit unstable and growing |
|15.| MapReduce is more fault tolerant  | Spark is bit less fault tolerant  |
|16.| MapReduce is low performance  | Spark is high performance |
|17.| MapReduce is well integrated with all data sources  | Spark uses MapReduce utils to integrate with all data sources |
|18.| MapReduce doesn't offer interactive data analysis natively  | Spark offers interactive data analysis  |
|19.| MapReduce doesn't offer global state  | Spark offers glboal state using Shared Variables  |
|20.| MapReduce doesn't offer data caching  | Spark offers data caching |


* Spark has excellent performance and is highly cost-effective due its in-memory data processing. It’s compatible with all of Hadoop’s data sources and file formats, and offers easy to use client APIs for several languages, it also has a faster learning curve. Spark even includes graph processing and machine-learning capabilities.
* Hadoop MapReduce is a more mature platform and it was built for batch processing. It can be more cost-effective than Spark for truly Big Data that doesn’t fit in memory and also due to the greater availability of experienced staff. Furthermore, the Hadoop MapReduce ecosystem is currently bigger thanks to many supporting projects, tools and cloud services.
