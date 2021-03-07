package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest
import java.util.{ LinkedHashMap => JLinkedHashMap }
import java.util.{ Map => JMap }
import java.util.Objects
import scala.collection.mutable
import scala.collection.JavaConverters._
import SecurityAdvisoryEcosystemTO._
import SecurityAdvisorySeverityTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class SecurityVulnerabilitiesQueryRequest(alias: String) extends GraphQLOperationRequest {

    private final lazy val input = new JLinkedHashMap[String, java.lang.Object]()
    private final lazy val useObjectMapperForInputSerialization: mutable.Set[String] = mutable.Set()

    def setAfter(after: String): Unit = {
        this.input.put("after", after)
    }

    def setBefore(before: String): Unit = {
        this.input.put("before", before)
    }

    def setEcosystem(ecosystem: SecurityAdvisoryEcosystemTO): Unit = {
        this.input.put("ecosystem", ecosystem)
    }

    def setFirst(first: Option[Int]): Unit = {
        this.input.put("first", first)
    }

    def setLast(last: Option[Int]): Unit = {
        this.input.put("last", last)
    }

    def setOrderBy(orderBy: SecurityVulnerabilityOrderTO): Unit = {
        this.input.put("orderBy", orderBy)
    }

    def setPackage(`package`: String): Unit = {
        this.input.put("package", `package`)
    }

    def setSeverities(severities: Seq[SecurityAdvisorySeverityTO]): Unit = {
        this.input.put("severities", severities)
    }

    override def getOperationType(): GraphQLOperation = SecurityVulnerabilitiesQueryRequest.OPERATION_TYPE

    override def getOperationName(): String = SecurityVulnerabilitiesQueryRequest.OPERATION_NAME

    override def getAlias(): String = if (alias != null) alias else SecurityVulnerabilitiesQueryRequest.OPERATION_NAME

    override def getInput(): JMap[String, java.lang.Object] = input

    override def getUseObjectMapperForInputSerialization(): java.util.Set[String] = useObjectMapperForInputSerialization.asJava

    override def toString(): String = Objects.toString(input)
}

object SecurityVulnerabilitiesQueryRequest {

    final val OPERATION_NAME: String = "securityVulnerabilities"
    final val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.QUERY

    def apply(alias: String) = new SecurityVulnerabilitiesQueryRequest(alias)

    def apply() = new SecurityVulnerabilitiesQueryRequest(null)


    def builder(): Builder = new Builder()

    class Builder {

        private var $alias: String = _
        private var after: String = _
        private var before: String = _
        private var ecosystem: SecurityAdvisoryEcosystemTO = _
        private var first: Option[Int] = _
        private var last: Option[Int] = _
        private var orderBy: SecurityVulnerabilityOrderTO = _
        private var `package`: String = _
        private var severities: Seq[SecurityAdvisorySeverityTO] = _

        def alias(alias: String): Builder = {
            this.$alias = alias
            this
        }

        def setAfter(after: String): Builder = {
            this.after = after
            this
        }
        def setBefore(before: String): Builder = {
            this.before = before
            this
        }
        def setEcosystem(ecosystem: SecurityAdvisoryEcosystemTO): Builder = {
            this.ecosystem = ecosystem
            this
        }
        def setFirst(first: Option[Int]): Builder = {
            this.first = first
            this
        }
        def setLast(last: Option[Int]): Builder = {
            this.last = last
            this
        }
        def setOrderBy(orderBy: SecurityVulnerabilityOrderTO): Builder = {
            this.orderBy = orderBy
            this
        }
        def setPackage(`package`: String): Builder = {
            this.`package` = `package`
            this
        }
        def setSeverities(severities: Seq[SecurityAdvisorySeverityTO]): Builder = {
            this.severities = severities
            this
        }

        def build(): SecurityVulnerabilitiesQueryRequest = {
            val obj = new SecurityVulnerabilitiesQueryRequest($alias)
            obj.setAfter(after)
            obj.setBefore(before)
            obj.setEcosystem(ecosystem)
            obj.setFirst(first)
            obj.setLast(last)
            obj.setOrderBy(orderBy)
            obj.setPackage(`package`)
            obj.setSeverities(severities)
            obj
        }

    }
}
