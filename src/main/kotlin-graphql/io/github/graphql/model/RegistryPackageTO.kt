package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class RegistryPackageTO(
    val color: String,
    override
    val id: String,
    val latestVersion: RegistryPackageVersionTO?,
    val name: String,
    val nameWithOwner: String,
    val packageType: RegistryPackageTypeTO,
    val registryPackageType: String?,
    val repository: RepositoryTO?,
    val statistics: RegistryPackageStatisticsTO?
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("color: " + GraphQLRequestSerializer.getEntry(color))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (latestVersion != null) {
            joiner.add("latestVersion: " + GraphQLRequestSerializer.getEntry(latestVersion))
        }
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("nameWithOwner: " + GraphQLRequestSerializer.getEntry(nameWithOwner))
        joiner.add("packageType: " + GraphQLRequestSerializer.getEntry(packageType))
        if (registryPackageType != null) {
            joiner.add("registryPackageType: " + GraphQLRequestSerializer.getEntry(registryPackageType))
        }
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        }
        if (statistics != null) {
            joiner.add("statistics: " + GraphQLRequestSerializer.getEntry(statistics))
        }
        return joiner.toString()
    }

    class Builder {

        private lateinit var color: String
        private lateinit var id: String
        private var latestVersion: RegistryPackageVersionTO? = null
        private lateinit var name: String
        private lateinit var nameWithOwner: String
        private lateinit var packageType: RegistryPackageTypeTO
        private var registryPackageType: String? = null
        private var repository: RepositoryTO? = null
        private var statistics: RegistryPackageStatisticsTO? = null

        fun setColor(color: String): Builder {
            this.color = color
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setLatestVersion(latestVersion: RegistryPackageVersionTO?): Builder {
            this.latestVersion = latestVersion
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setNameWithOwner(nameWithOwner: String): Builder {
            this.nameWithOwner = nameWithOwner
            return this
        }

        fun setPackageType(packageType: RegistryPackageTypeTO): Builder {
            this.packageType = packageType
            return this
        }

        fun setRegistryPackageType(registryPackageType: String?): Builder {
            this.registryPackageType = registryPackageType
            return this
        }

        fun setRepository(repository: RepositoryTO?): Builder {
            this.repository = repository
            return this
        }

        fun setStatistics(statistics: RegistryPackageStatisticsTO?): Builder {
            this.statistics = statistics
            return this
        }

        fun build(): RegistryPackageTO {
            return RegistryPackageTO(color, id, latestVersion, name, nameWithOwner, packageType, registryPackageType, repository, statistics)
        }
    }
}
