package io.github.graphql

import scala.jdk.CollectionConverters._

object JavaCollectionUtils {

  def listToMap[K, V](keys: java.util.List[K], values: java.util.List[V]): java.util.Map[K, V] = {
    (keys.asScala zip values.asScala).toMap.asJava
  }

  def listToMap[K, V](keys: List[K], values: List[V]): java.util.Map[K, V] = {
    (keys zip values).toMap.asJava
  }
}
