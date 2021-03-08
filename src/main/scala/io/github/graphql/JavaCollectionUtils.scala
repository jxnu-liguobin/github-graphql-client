package io.github.graphql

import scala.jdk.CollectionConverters._

/**
 *
 * @author 梦境迷离
 * @since 2021/3/8
 * @version 1.0
 */
object JavaCollectionUtils {

  def listToMap[K, V](keys: java.util.List[K], values: java.util.List[V]): java.util.Map[K, V] = {
    (keys.asScala zip values.asScala).toMap.asJava
  }

}
