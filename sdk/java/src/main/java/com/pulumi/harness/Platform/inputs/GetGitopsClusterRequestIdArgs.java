// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsClusterRequestIdArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetGitopsClusterRequestIdArgs Empty = new GetGitopsClusterRequestIdArgs();

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private GetGitopsClusterRequestIdArgs() {}

    private GetGitopsClusterRequestIdArgs(GetGitopsClusterRequestIdArgs $) {
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsClusterRequestIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsClusterRequestIdArgs $;

        public Builder() {
            $ = new GetGitopsClusterRequestIdArgs();
        }

        public Builder(GetGitopsClusterRequestIdArgs defaults) {
            $ = new GetGitopsClusterRequestIdArgs(Objects.requireNonNull(defaults));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GetGitopsClusterRequestIdArgs build() {
            return $;
        }
    }

}
