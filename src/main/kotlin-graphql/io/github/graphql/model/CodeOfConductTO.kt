package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class CodeOfConductTO(
    val body: String?,
    override
    val id: String,
    val key: String,
    val name: String,
    val resourcePath: String?,
    val url: String?
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("key: " + GraphQLRequestSerializer.getEntry(key))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        if (resourcePath != null) {
            joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        }
        return joiner.toString()
    }

    class Builder {

        private var body: String? = null
        private lateinit var id: String
        private lateinit var key: String
        private lateinit var name: String
        private var resourcePath: String? = null
        private var url: String? = null

        fun setBody(body: String?): Builder {
            this.body = body
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setKey(key: String): Builder {
            this.key = key
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setResourcePath(resourcePath: String?): Builder {
            this.resourcePath = resourcePath
            return this
        }

        fun setUrl(url: String?): Builder {
            this.url = url
            return this
        }

        fun build(): CodeOfConductTO {
            return CodeOfConductTO(body, id, key, name, resourcePath, url)
        }
    }
}
