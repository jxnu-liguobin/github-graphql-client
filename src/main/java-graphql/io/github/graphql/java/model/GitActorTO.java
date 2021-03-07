package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class GitActorTO implements java.io.Serializable {

    private String date;
    private String email;
    private String name;
    private UserTO user;

    public GitActorTO() {
    }

    public GitActorTO(String date, String email, String name, UserTO user) {
        this.date = date;
        this.email = email;
        this.name = name;
        this.user = user;
    }

    public String getDate() {
        return date;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public UserTO getUser() {
        return user;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final GitActorTO that = (GitActorTO) obj;
        return Objects.equals(date, that.date)
            && Objects.equals(email, that.email)
            && Objects.equals(name, that.name)
            && Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, email, name, user);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (date != null) {
            joiner.add("date: " + GraphQLRequestSerializer.getEntry(date));
        }
        if (email != null) {
            joiner.add("email: " + GraphQLRequestSerializer.getEntry(email));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user));
        }
        return joiner.toString();
    }

    public static GitActorTO.Builder builder() {
        return new GitActorTO.Builder();
    }

    public static class Builder {

        private String date;
        private String email;
        private String name;
        private UserTO user;

        public Builder() {
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setUser(UserTO user) {
            this.user = user;
            return this;
        }


        public GitActorTO build() {
            return new GitActorTO(date, email, name, user);
        }

    }
}
