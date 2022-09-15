// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.inputs.UserGroupPermissionsAppPermissionsArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserGroupPermissionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserGroupPermissionsArgs Empty = new UserGroupPermissionsArgs();

    /**
     * The account permissions of the user group. Valid options are ADMINISTER*OTHER*ACCOUNT*FUNCTIONS, CREATE*AND*DELETE*APPLICATION, CREATE*CUSTOM*DASHBOARDS, MANAGE*ALERT*NOTIFICATION*RULES, MANAGE*API*KEYS, MANAGE*APPLICATION*STACKS, MANAGE*AUTHENTICATION*SETTINGS, MANAGE*CLOUD*PROVIDERS, MANAGE*CONFIG*AS*CODE, MANAGE*CONNECTORS, MANAGE*CUSTOM*DASHBOARDS, MANAGE*DELEGATE*PROFILES, MANAGE*DELEGATES, MANAGE*DEPLOYMENT*FREEZES, MANAGE*IP*WHITELIST, MANAGE*PIPELINE*GOVERNANCE*STANDARDS, MANAGE*RESTRICTED*ACCESS, MANAGE*SECRET*MANAGERS, MANAGE*SECRETS, MANAGE*SSH*AND*WINRM, MANAGE*TAGS, MANAGE*TEMPLATE*LIBRARY, MANAGE*USER*AND*USER*GROUPS*AND*API*KEYS, MANAGE*USERS*AND*GROUPS, READ*USERS*AND*GROUPS, VIEW*AUDITS, VIEW*USER*AND*USER*GROUPS*AND*API_KEYS
     * 
     */
    @Import(name="accountPermissions")
    private @Nullable Output<List<String>> accountPermissions;

    /**
     * @return The account permissions of the user group. Valid options are ADMINISTER*OTHER*ACCOUNT*FUNCTIONS, CREATE*AND*DELETE*APPLICATION, CREATE*CUSTOM*DASHBOARDS, MANAGE*ALERT*NOTIFICATION*RULES, MANAGE*API*KEYS, MANAGE*APPLICATION*STACKS, MANAGE*AUTHENTICATION*SETTINGS, MANAGE*CLOUD*PROVIDERS, MANAGE*CONFIG*AS*CODE, MANAGE*CONNECTORS, MANAGE*CUSTOM*DASHBOARDS, MANAGE*DELEGATE*PROFILES, MANAGE*DELEGATES, MANAGE*DEPLOYMENT*FREEZES, MANAGE*IP*WHITELIST, MANAGE*PIPELINE*GOVERNANCE*STANDARDS, MANAGE*RESTRICTED*ACCESS, MANAGE*SECRET*MANAGERS, MANAGE*SECRETS, MANAGE*SSH*AND*WINRM, MANAGE*TAGS, MANAGE*TEMPLATE*LIBRARY, MANAGE*USER*AND*USER*GROUPS*AND*API*KEYS, MANAGE*USERS*AND*GROUPS, READ*USERS*AND*GROUPS, VIEW*AUDITS, VIEW*USER*AND*USER*GROUPS*AND*API_KEYS
     * 
     */
    public Optional<Output<List<String>>> accountPermissions() {
        return Optional.ofNullable(this.accountPermissions);
    }

    /**
     * Application specific permissions
     * 
     */
    @Import(name="appPermissions")
    private @Nullable Output<UserGroupPermissionsAppPermissionsArgs> appPermissions;

    /**
     * @return Application specific permissions
     * 
     */
    public Optional<Output<UserGroupPermissionsAppPermissionsArgs>> appPermissions() {
        return Optional.ofNullable(this.appPermissions);
    }

    private UserGroupPermissionsArgs() {}

    private UserGroupPermissionsArgs(UserGroupPermissionsArgs $) {
        this.accountPermissions = $.accountPermissions;
        this.appPermissions = $.appPermissions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserGroupPermissionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserGroupPermissionsArgs $;

        public Builder() {
            $ = new UserGroupPermissionsArgs();
        }

        public Builder(UserGroupPermissionsArgs defaults) {
            $ = new UserGroupPermissionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountPermissions The account permissions of the user group. Valid options are ADMINISTER*OTHER*ACCOUNT*FUNCTIONS, CREATE*AND*DELETE*APPLICATION, CREATE*CUSTOM*DASHBOARDS, MANAGE*ALERT*NOTIFICATION*RULES, MANAGE*API*KEYS, MANAGE*APPLICATION*STACKS, MANAGE*AUTHENTICATION*SETTINGS, MANAGE*CLOUD*PROVIDERS, MANAGE*CONFIG*AS*CODE, MANAGE*CONNECTORS, MANAGE*CUSTOM*DASHBOARDS, MANAGE*DELEGATE*PROFILES, MANAGE*DELEGATES, MANAGE*DEPLOYMENT*FREEZES, MANAGE*IP*WHITELIST, MANAGE*PIPELINE*GOVERNANCE*STANDARDS, MANAGE*RESTRICTED*ACCESS, MANAGE*SECRET*MANAGERS, MANAGE*SECRETS, MANAGE*SSH*AND*WINRM, MANAGE*TAGS, MANAGE*TEMPLATE*LIBRARY, MANAGE*USER*AND*USER*GROUPS*AND*API*KEYS, MANAGE*USERS*AND*GROUPS, READ*USERS*AND*GROUPS, VIEW*AUDITS, VIEW*USER*AND*USER*GROUPS*AND*API_KEYS
         * 
         * @return builder
         * 
         */
        public Builder accountPermissions(@Nullable Output<List<String>> accountPermissions) {
            $.accountPermissions = accountPermissions;
            return this;
        }

        /**
         * @param accountPermissions The account permissions of the user group. Valid options are ADMINISTER*OTHER*ACCOUNT*FUNCTIONS, CREATE*AND*DELETE*APPLICATION, CREATE*CUSTOM*DASHBOARDS, MANAGE*ALERT*NOTIFICATION*RULES, MANAGE*API*KEYS, MANAGE*APPLICATION*STACKS, MANAGE*AUTHENTICATION*SETTINGS, MANAGE*CLOUD*PROVIDERS, MANAGE*CONFIG*AS*CODE, MANAGE*CONNECTORS, MANAGE*CUSTOM*DASHBOARDS, MANAGE*DELEGATE*PROFILES, MANAGE*DELEGATES, MANAGE*DEPLOYMENT*FREEZES, MANAGE*IP*WHITELIST, MANAGE*PIPELINE*GOVERNANCE*STANDARDS, MANAGE*RESTRICTED*ACCESS, MANAGE*SECRET*MANAGERS, MANAGE*SECRETS, MANAGE*SSH*AND*WINRM, MANAGE*TAGS, MANAGE*TEMPLATE*LIBRARY, MANAGE*USER*AND*USER*GROUPS*AND*API*KEYS, MANAGE*USERS*AND*GROUPS, READ*USERS*AND*GROUPS, VIEW*AUDITS, VIEW*USER*AND*USER*GROUPS*AND*API_KEYS
         * 
         * @return builder
         * 
         */
        public Builder accountPermissions(List<String> accountPermissions) {
            return accountPermissions(Output.of(accountPermissions));
        }

        /**
         * @param accountPermissions The account permissions of the user group. Valid options are ADMINISTER*OTHER*ACCOUNT*FUNCTIONS, CREATE*AND*DELETE*APPLICATION, CREATE*CUSTOM*DASHBOARDS, MANAGE*ALERT*NOTIFICATION*RULES, MANAGE*API*KEYS, MANAGE*APPLICATION*STACKS, MANAGE*AUTHENTICATION*SETTINGS, MANAGE*CLOUD*PROVIDERS, MANAGE*CONFIG*AS*CODE, MANAGE*CONNECTORS, MANAGE*CUSTOM*DASHBOARDS, MANAGE*DELEGATE*PROFILES, MANAGE*DELEGATES, MANAGE*DEPLOYMENT*FREEZES, MANAGE*IP*WHITELIST, MANAGE*PIPELINE*GOVERNANCE*STANDARDS, MANAGE*RESTRICTED*ACCESS, MANAGE*SECRET*MANAGERS, MANAGE*SECRETS, MANAGE*SSH*AND*WINRM, MANAGE*TAGS, MANAGE*TEMPLATE*LIBRARY, MANAGE*USER*AND*USER*GROUPS*AND*API*KEYS, MANAGE*USERS*AND*GROUPS, READ*USERS*AND*GROUPS, VIEW*AUDITS, VIEW*USER*AND*USER*GROUPS*AND*API_KEYS
         * 
         * @return builder
         * 
         */
        public Builder accountPermissions(String... accountPermissions) {
            return accountPermissions(List.of(accountPermissions));
        }

        /**
         * @param appPermissions Application specific permissions
         * 
         * @return builder
         * 
         */
        public Builder appPermissions(@Nullable Output<UserGroupPermissionsAppPermissionsArgs> appPermissions) {
            $.appPermissions = appPermissions;
            return this;
        }

        /**
         * @param appPermissions Application specific permissions
         * 
         * @return builder
         * 
         */
        public Builder appPermissions(UserGroupPermissionsAppPermissionsArgs appPermissions) {
            return appPermissions(Output.of(appPermissions));
        }

        public UserGroupPermissionsArgs build() {
            return $;
        }
    }

}
