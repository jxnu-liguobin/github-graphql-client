package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest
import java.util.{ LinkedHashMap => JLinkedHashMap }
import java.util.{ Map => JMap }
import java.util.Objects
import scala.collection.mutable
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class MarketplaceListingsQueryRequest(alias: String) extends GraphQLOperationRequest {

    private final lazy val input = new JLinkedHashMap[String, java.lang.Object]()
    private final lazy val useObjectMapperForInputSerialization: mutable.Set[String] = mutable.Set()

    def setAdminId(adminId: String): Unit = {
        this.input.put("adminId", adminId)
    }

    def setAfter(after: String): Unit = {
        this.input.put("after", after)
    }

    def setAllStates(allStates: Option[Boolean]): Unit = {
        this.input.put("allStates", allStates)
    }

    def setBefore(before: String): Unit = {
        this.input.put("before", before)
    }

    def setCategorySlug(categorySlug: String): Unit = {
        this.input.put("categorySlug", categorySlug)
    }

    def setFirst(first: Option[Int]): Unit = {
        this.input.put("first", first)
    }

    def setLast(last: Option[Int]): Unit = {
        this.input.put("last", last)
    }

    def setOrganizationId(organizationId: String): Unit = {
        this.input.put("organizationId", organizationId)
    }

    def setPrimaryCategoryOnly(primaryCategoryOnly: Option[Boolean]): Unit = {
        this.input.put("primaryCategoryOnly", primaryCategoryOnly)
    }

    def setSlugs(slugs: Seq[String]): Unit = {
        this.input.put("slugs", slugs)
    }

    def setUseTopicAliases(useTopicAliases: Option[Boolean]): Unit = {
        this.input.put("useTopicAliases", useTopicAliases)
    }

    def setViewerCanAdmin(viewerCanAdmin: Option[Boolean]): Unit = {
        this.input.put("viewerCanAdmin", viewerCanAdmin)
    }

    def setWithFreeTrialsOnly(withFreeTrialsOnly: Option[Boolean]): Unit = {
        this.input.put("withFreeTrialsOnly", withFreeTrialsOnly)
    }

    override def getOperationType(): GraphQLOperation = MarketplaceListingsQueryRequest.OPERATION_TYPE

    override def getOperationName(): String = MarketplaceListingsQueryRequest.OPERATION_NAME

    override def getAlias(): String = if (alias != null) alias else MarketplaceListingsQueryRequest.OPERATION_NAME

    override def getInput(): JMap[String, java.lang.Object] = input

    override def getUseObjectMapperForInputSerialization(): java.util.Set[String] = useObjectMapperForInputSerialization.asJava

    override def toString(): String = Objects.toString(input)
}

object MarketplaceListingsQueryRequest {

    final val OPERATION_NAME: String = "marketplaceListings"
    final val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.QUERY

    def apply(alias: String) = new MarketplaceListingsQueryRequest(alias)

    def apply() = new MarketplaceListingsQueryRequest(null)


    def builder(): Builder = new Builder()

    class Builder {

        private var $alias: String = _
        private var adminId: String = _
        private var after: String = _
        private var allStates: Option[Boolean] = _
        private var before: String = _
        private var categorySlug: String = _
        private var first: Option[Int] = _
        private var last: Option[Int] = _
        private var organizationId: String = _
        private var primaryCategoryOnly: Option[Boolean] = Some(false)
        private var slugs: Seq[String] = _
        private var useTopicAliases: Option[Boolean] = _
        private var viewerCanAdmin: Option[Boolean] = _
        private var withFreeTrialsOnly: Option[Boolean] = Some(false)

        def alias(alias: String): Builder = {
            this.$alias = alias
            this
        }

        def setAdminId(adminId: String): Builder = {
            this.adminId = adminId
            this
        }
        def setAfter(after: String): Builder = {
            this.after = after
            this
        }
        def setAllStates(allStates: Option[Boolean]): Builder = {
            this.allStates = allStates
            this
        }
        def setBefore(before: String): Builder = {
            this.before = before
            this
        }
        def setCategorySlug(categorySlug: String): Builder = {
            this.categorySlug = categorySlug
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
        def setOrganizationId(organizationId: String): Builder = {
            this.organizationId = organizationId
            this
        }
        def setPrimaryCategoryOnly(primaryCategoryOnly: Option[Boolean]): Builder = {
            this.primaryCategoryOnly = primaryCategoryOnly
            this
        }
        def setSlugs(slugs: Seq[String]): Builder = {
            this.slugs = slugs
            this
        }
        def setUseTopicAliases(useTopicAliases: Option[Boolean]): Builder = {
            this.useTopicAliases = useTopicAliases
            this
        }
        def setViewerCanAdmin(viewerCanAdmin: Option[Boolean]): Builder = {
            this.viewerCanAdmin = viewerCanAdmin
            this
        }
        def setWithFreeTrialsOnly(withFreeTrialsOnly: Option[Boolean]): Builder = {
            this.withFreeTrialsOnly = withFreeTrialsOnly
            this
        }

        def build(): MarketplaceListingsQueryRequest = {
            val obj = new MarketplaceListingsQueryRequest($alias)
            obj.setAdminId(adminId)
            obj.setAfter(after)
            obj.setAllStates(allStates)
            obj.setBefore(before)
            obj.setCategorySlug(categorySlug)
            obj.setFirst(first)
            obj.setLast(last)
            obj.setOrganizationId(organizationId)
            obj.setPrimaryCategoryOnly(primaryCategoryOnly)
            obj.setSlugs(slugs)
            obj.setUseTopicAliases(useTopicAliases)
            obj.setViewerCanAdmin(viewerCanAdmin)
            obj.setWithFreeTrialsOnly(withFreeTrialsOnly)
            obj
        }

    }
}
