package io.github.graphql.java;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import io.github.graphql.common.ServerConfig;

import java.lang.reflect.Proxy;

final public class GitHubJavaClient {

    private ServerConfig config;
    private Class<?> resolver;
    private GraphQLResponseProjection projection;
    private Class<? extends GraphQLOperationRequest> request;

    private GitHubJavaClient() {

    }

    private Object getResolver() {
        JavaResolverProxy invocationHandler = new JavaResolverProxy(config,projection, request);
        return Proxy.newProxyInstance(resolver.getClassLoader(), new Class[]{resolver}, invocationHandler);
    }


    public void setConfig(ServerConfig config) {
        this.config = config;
    }

    private void setResolver(Class<?> resolver) {
        this.resolver = resolver;
    }

    private void setRequest(Class<? extends GraphQLOperationRequest> request) {
        this.request = request;
    }

    private void setProjection(GraphQLResponseProjection projection) {
        this.projection = projection;
    }

    public static GitHubJavaClientBuilder newBuilder() {
        return new GitHubJavaClientBuilder();
    }

    public static class GitHubJavaClientBuilder {
        private GraphQLResponseProjection projection;
        private Class<? extends GraphQLOperationRequest> request;
        private ServerConfig config;

        private GitHubJavaClientBuilder() {

        }

        public GitHubJavaClientBuilder setRequest(Class<? extends GraphQLOperationRequest> request) {
            this.request = request;
            return this;
        }

        public GitHubJavaClientBuilder setConfig(ServerConfig config) {
            this.config = config;
            return this;
        }

        public GitHubJavaClientBuilder setProjection(GraphQLResponseProjection projection) {
            this.projection = projection;
            return this;
        }


        /**
         * Resolver is generic type, if we do not want to cast to real resolver on the user side, we need set resolver when invoker builder method,
         * although this is not in line with the conventional builder model
         *
         * @return R resolver which need for invoke graphql
         */
        @SuppressWarnings(value = "unchecked")
        public <R> R build(Class<R> resolver) {
            GitHubJavaClient invoke = new GitHubJavaClient();
            assert (resolver != null);
            assert (request != null);
            invoke.setProjection(projection);
            invoke.setResolver(resolver);
            invoke.setConfig(config);
            invoke.setRequest(request);
            return (R) invoke.getResolver();
        }
    }

}