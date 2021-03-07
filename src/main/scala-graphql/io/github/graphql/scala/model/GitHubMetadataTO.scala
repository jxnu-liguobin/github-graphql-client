package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class GitHubMetadataTO(
    @javax.validation.constraints.NotNull
    gitHubServicesSha: String,
    @javax.validation.constraints.NotNull
    gitIpAddresses: Seq[String],
    @javax.validation.constraints.NotNull
    hookIpAddresses: Seq[String],
    @javax.validation.constraints.NotNull
    importerIpAddresses: Seq[String],
    isPasswordAuthenticationVerifiable: Boolean,
    @javax.validation.constraints.NotNull
    pagesIpAddresses: Seq[String]
) {

    override def toString(): String = {
        Seq(
            if (gitHubServicesSha != null) "gitHubServicesSha: " + GraphQLRequestSerializer.getEntry(gitHubServicesSha) else "",
            if (gitIpAddresses != null) "gitIpAddresses: " + GraphQLRequestSerializer.getEntry(gitIpAddresses.asJava) else "",
            if (hookIpAddresses != null) "hookIpAddresses: " + GraphQLRequestSerializer.getEntry(hookIpAddresses.asJava) else "",
            if (importerIpAddresses != null) "importerIpAddresses: " + GraphQLRequestSerializer.getEntry(importerIpAddresses.asJava) else "",
            "isPasswordAuthenticationVerifiable: " + GraphQLRequestSerializer.getEntry(isPasswordAuthenticationVerifiable),
            if (pagesIpAddresses != null) "pagesIpAddresses: " + GraphQLRequestSerializer.getEntry(pagesIpAddresses.asJava) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[GitHubMetadataTO]
        Objects.equals(gitHubServicesSha, that.gitHubServicesSha) &&
        Objects.equals(gitIpAddresses, that.gitIpAddresses) &&
        Objects.equals(hookIpAddresses, that.hookIpAddresses) &&
        Objects.equals(importerIpAddresses, that.importerIpAddresses) &&
        Objects.equals(isPasswordAuthenticationVerifiable, that.isPasswordAuthenticationVerifiable) &&
        Objects.equals(pagesIpAddresses, that.pagesIpAddresses)
    }

    override def hashCode(): Int = {
        Objects.hash(gitHubServicesSha, gitIpAddresses, hookIpAddresses, importerIpAddresses, isPasswordAuthenticationVerifiable, pagesIpAddresses)
    }
}

object GitHubMetadataTO {

    def builder(): GitHubMetadataTO.Builder = new Builder()

    class Builder {

        private var gitHubServicesSha: String = _
        private var gitIpAddresses: Seq[String] = _
        private var hookIpAddresses: Seq[String] = _
        private var importerIpAddresses: Seq[String] = _
        private var isPasswordAuthenticationVerifiable: Boolean = _
        private var pagesIpAddresses: Seq[String] = _

        def setGitHubServicesSha(gitHubServicesSha: String): Builder = {
            this.gitHubServicesSha = gitHubServicesSha
            this
        }

        def setGitIpAddresses(gitIpAddresses: Seq[String]): Builder = {
            this.gitIpAddresses = gitIpAddresses
            this
        }

        def setHookIpAddresses(hookIpAddresses: Seq[String]): Builder = {
            this.hookIpAddresses = hookIpAddresses
            this
        }

        def setImporterIpAddresses(importerIpAddresses: Seq[String]): Builder = {
            this.importerIpAddresses = importerIpAddresses
            this
        }

        def setIsPasswordAuthenticationVerifiable(isPasswordAuthenticationVerifiable: Boolean): Builder = {
            this.isPasswordAuthenticationVerifiable = isPasswordAuthenticationVerifiable
            this
        }

        def setPagesIpAddresses(pagesIpAddresses: Seq[String]): Builder = {
            this.pagesIpAddresses = pagesIpAddresses
            this
        }

        def build(): GitHubMetadataTO = new GitHubMetadataTO(gitHubServicesSha, gitIpAddresses, hookIpAddresses, importerIpAddresses, isPasswordAuthenticationVerifiable, pagesIpAddresses)

    }
}
