package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class SecurityAdvisoryReferenceTO(
    @javax.validation.constraints.NotNull
    url: String
) {

    override def toString(): String = {
        Seq(
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[SecurityAdvisoryReferenceTO]
        Objects.equals(url, that.url)
    }

    override def hashCode(): Int = {
        Objects.hash(url)
    }
}

object SecurityAdvisoryReferenceTO {

    def builder(): SecurityAdvisoryReferenceTO.Builder = new Builder()

    class Builder {

        private var url: String = _

        def setUrl(url: String): Builder = {
            this.url = url
            this
        }

        def build(): SecurityAdvisoryReferenceTO = new SecurityAdvisoryReferenceTO(url)

    }
}
