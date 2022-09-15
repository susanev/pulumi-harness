// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class YamlConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final YamlConfigArgs Empty = new YamlConfigArgs();

    /**
     * The id of the application. This is required for all resources except global ones.
     * 
     */
    @Import(name="appId")
    private @Nullable Output<String> appId;

    /**
     * @return The id of the application. This is required for all resources except global ones.
     * 
     */
    public Optional<Output<String>> appId() {
        return Optional.ofNullable(this.appId);
    }

    /**
     * The raw YAML configuration.
     * 
     */
    @Import(name="content", required=true)
    private Output<String> content;

    /**
     * @return The raw YAML configuration.
     * 
     */
    public Output<String> content() {
        return this.content;
    }

    /**
     * The path of the resource.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return The path of the resource.
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    private YamlConfigArgs() {}

    private YamlConfigArgs(YamlConfigArgs $) {
        this.appId = $.appId;
        this.content = $.content;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(YamlConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private YamlConfigArgs $;

        public Builder() {
            $ = new YamlConfigArgs();
        }

        public Builder(YamlConfigArgs defaults) {
            $ = new YamlConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The id of the application. This is required for all resources except global ones.
         * 
         * @return builder
         * 
         */
        public Builder appId(@Nullable Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId The id of the application. This is required for all resources except global ones.
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param content The raw YAML configuration.
         * 
         * @return builder
         * 
         */
        public Builder content(Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The raw YAML configuration.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param path The path of the resource.
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path of the resource.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public YamlConfigArgs build() {
            $.content = Objects.requireNonNull($.content, "expected parameter 'content' to be non-null");
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
