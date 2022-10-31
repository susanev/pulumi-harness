// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitOpsAgentMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitOpsAgentMetadataArgs Empty = new GitOpsAgentMetadataArgs();

    @Import(name="highAvailability")
    private @Nullable Output<Boolean> highAvailability;

    public Optional<Output<Boolean>> highAvailability() {
        return Optional.ofNullable(this.highAvailability);
    }

    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    private GitOpsAgentMetadataArgs() {}

    private GitOpsAgentMetadataArgs(GitOpsAgentMetadataArgs $) {
        this.highAvailability = $.highAvailability;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitOpsAgentMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitOpsAgentMetadataArgs $;

        public Builder() {
            $ = new GitOpsAgentMetadataArgs();
        }

        public Builder(GitOpsAgentMetadataArgs defaults) {
            $ = new GitOpsAgentMetadataArgs(Objects.requireNonNull(defaults));
        }

        public Builder highAvailability(@Nullable Output<Boolean> highAvailability) {
            $.highAvailability = highAvailability;
            return this;
        }

        public Builder highAvailability(Boolean highAvailability) {
            return highAvailability(Output.of(highAvailability));
        }

        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public GitOpsAgentMetadataArgs build() {
            return $;
        }
    }

}
