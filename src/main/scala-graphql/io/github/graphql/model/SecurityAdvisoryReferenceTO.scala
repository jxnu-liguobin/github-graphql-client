package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
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
