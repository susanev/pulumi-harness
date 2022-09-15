// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationState extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationState Empty = new ApplicationState();

    /**
     * The application description
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The application description
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The id of the git sync connector
     * 
     */
    @Import(name="gitSyncConnectorId")
    private @Nullable Output<String> gitSyncConnectorId;

    /**
     * @return The id of the git sync connector
     * 
     */
    public Optional<Output<String>> gitSyncConnectorId() {
        return Optional.ofNullable(this.gitSyncConnectorId);
    }

    /**
     * True if git sync is enabled on this application
     * 
     */
    @Import(name="gitSyncEnabled")
    private @Nullable Output<Boolean> gitSyncEnabled;

    /**
     * @return True if git sync is enabled on this application
     * 
     */
    public Optional<Output<Boolean>> gitSyncEnabled() {
        return Optional.ofNullable(this.gitSyncEnabled);
    }

    /**
     * When this is set to true, all manual triggers will require API Key authorization
     * 
     */
    @Import(name="isManualTriggerAuthorized")
    private @Nullable Output<Boolean> isManualTriggerAuthorized;

    /**
     * @return When this is set to true, all manual triggers will require API Key authorization
     * 
     */
    public Optional<Output<Boolean>> isManualTriggerAuthorized() {
        return Optional.ofNullable(this.isManualTriggerAuthorized);
    }

    /**
     * The name of the application
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the application
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ApplicationState() {}

    private ApplicationState(ApplicationState $) {
        this.description = $.description;
        this.gitSyncConnectorId = $.gitSyncConnectorId;
        this.gitSyncEnabled = $.gitSyncEnabled;
        this.isManualTriggerAuthorized = $.isManualTriggerAuthorized;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationState $;

        public Builder() {
            $ = new ApplicationState();
        }

        public Builder(ApplicationState defaults) {
            $ = new ApplicationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The application description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The application description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param gitSyncConnectorId The id of the git sync connector
         * 
         * @return builder
         * 
         */
        public Builder gitSyncConnectorId(@Nullable Output<String> gitSyncConnectorId) {
            $.gitSyncConnectorId = gitSyncConnectorId;
            return this;
        }

        /**
         * @param gitSyncConnectorId The id of the git sync connector
         * 
         * @return builder
         * 
         */
        public Builder gitSyncConnectorId(String gitSyncConnectorId) {
            return gitSyncConnectorId(Output.of(gitSyncConnectorId));
        }

        /**
         * @param gitSyncEnabled True if git sync is enabled on this application
         * 
         * @return builder
         * 
         */
        public Builder gitSyncEnabled(@Nullable Output<Boolean> gitSyncEnabled) {
            $.gitSyncEnabled = gitSyncEnabled;
            return this;
        }

        /**
         * @param gitSyncEnabled True if git sync is enabled on this application
         * 
         * @return builder
         * 
         */
        public Builder gitSyncEnabled(Boolean gitSyncEnabled) {
            return gitSyncEnabled(Output.of(gitSyncEnabled));
        }

        /**
         * @param isManualTriggerAuthorized When this is set to true, all manual triggers will require API Key authorization
         * 
         * @return builder
         * 
         */
        public Builder isManualTriggerAuthorized(@Nullable Output<Boolean> isManualTriggerAuthorized) {
            $.isManualTriggerAuthorized = isManualTriggerAuthorized;
            return this;
        }

        /**
         * @param isManualTriggerAuthorized When this is set to true, all manual triggers will require API Key authorization
         * 
         * @return builder
         * 
         */
        public Builder isManualTriggerAuthorized(Boolean isManualTriggerAuthorized) {
            return isManualTriggerAuthorized(Output.of(isManualTriggerAuthorized));
        }

        /**
         * @param name The name of the application
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the application
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags Tags to associate with the resource. Tags should be in the form `name:value`.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags to associate with the resource. Tags should be in the form `name:value`.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags to associate with the resource. Tags should be in the form `name:value`.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public ApplicationState build() {
            return $;
        }
    }

}
