// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitOpsClusterQueryIdArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitOpsClusterQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitOpsClusterQueryArgs Empty = new GitOpsClusterQueryArgs();

    @Import(name="ids")
    private @Nullable Output<List<GitOpsClusterQueryIdArgs>> ids;

    public Optional<Output<List<GitOpsClusterQueryIdArgs>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="server")
    private @Nullable Output<String> server;

    public Optional<Output<String>> server() {
        return Optional.ofNullable(this.server);
    }

    private GitOpsClusterQueryArgs() {}

    private GitOpsClusterQueryArgs(GitOpsClusterQueryArgs $) {
        this.ids = $.ids;
        this.name = $.name;
        this.server = $.server;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitOpsClusterQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitOpsClusterQueryArgs $;

        public Builder() {
            $ = new GitOpsClusterQueryArgs();
        }

        public Builder(GitOpsClusterQueryArgs defaults) {
            $ = new GitOpsClusterQueryArgs(Objects.requireNonNull(defaults));
        }

        public Builder ids(@Nullable Output<List<GitOpsClusterQueryIdArgs>> ids) {
            $.ids = ids;
            return this;
        }

        public Builder ids(List<GitOpsClusterQueryIdArgs> ids) {
            return ids(Output.of(ids));
        }

        public Builder ids(GitOpsClusterQueryIdArgs... ids) {
            return ids(List.of(ids));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder server(@Nullable Output<String> server) {
            $.server = server;
            return this;
        }

        public Builder server(String server) {
            return server(Output.of(server));
        }

        public GitOpsClusterQueryArgs build() {
            return $;
        }
    }

}