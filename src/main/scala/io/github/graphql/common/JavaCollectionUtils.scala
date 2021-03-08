package io.github.graphql.common

import java.util
import scala.jdk.CollectionConverters._

object JavaCollectionUtils {

  def listToMap[K, V](keys: util.List[K], values: util.List[V]): util.Map[K, V] = {
    (keys.asScala zip values.asScala).toMap.asJava
  }

}
