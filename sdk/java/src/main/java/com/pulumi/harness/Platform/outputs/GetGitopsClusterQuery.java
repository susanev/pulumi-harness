// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GetGitopsClusterQueryId;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGitopsClusterQuery {
    private @Nullable List<GetGitopsClusterQueryId> ids;
    private @Nullable String name;
    private @Nullable String server;

    private GetGitopsClusterQuery() {}
    public List<GetGitopsClusterQueryId> ids() {
        return this.ids == null ? List.of() : this.ids;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> server() {
        return Optional.ofNullable(this.server);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitopsClusterQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetGitopsClusterQueryId> ids;
        private @Nullable String name;
        private @Nullable String server;
        public Builder() {}
        public Builder(GetGitopsClusterQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ids = defaults.ids;
    	      this.name = defaults.name;
    	      this.server = defaults.server;
        }

        @CustomType.Setter
        public Builder ids(@Nullable List<GetGitopsClusterQueryId> ids) {
            this.ids = ids;
            return this;
        }
        public Builder ids(GetGitopsClusterQueryId... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder server(@Nullable String server) {
            this.server = server;
            return this;
        }
        public GetGitopsClusterQuery build() {
            final var o = new GetGitopsClusterQuery();
            o.ids = ids;
            o.name = name;
            o.server = server;
            return o;
        }
    }
}