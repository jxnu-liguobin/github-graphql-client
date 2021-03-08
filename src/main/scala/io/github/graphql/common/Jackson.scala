package io.github.graphql.common

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.{ DeserializationFeature, ObjectMapper, SerializationFeature }
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule
import com.fasterxml.jackson.module.scala.ScalaObjectMapper

object Jackson {

  lazy val objectMapper: ObjectMapper with ScalaObjectMapper = {
    val mapper = new ObjectMapper() with ScalaObjectMapper
    mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL)
    mapper.setSerializationInclusion(JsonInclude.Include.NON_ABSENT)
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
    mapper.registerModules(new ParameterNamesModule)
    mapper.registerModule(new Jdk8Module)
    mapper.registerModule(new JavaTimeModule)
    mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
    mapper
  }

}