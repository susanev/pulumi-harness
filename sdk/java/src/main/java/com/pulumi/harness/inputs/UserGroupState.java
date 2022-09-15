// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.inputs.UserGroupLdapSettingsArgs;
import com.pulumi.harness.inputs.UserGroupNotificationSettingsArgs;
import com.pulumi.harness.inputs.UserGroupPermissionsArgs;
import com.pulumi.harness.inputs.UserGroupSamlSettingsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserGroupState extends com.pulumi.resources.ResourceArgs {

    public static final UserGroupState Empty = new UserGroupState();

    /**
     * The description of the user group.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the user group.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Indicates whether the user group was imported by SCIM.
     * 
     */
    @Import(name="importedByScim")
    private @Nullable Output<Boolean> importedByScim;

    /**
     * @return Indicates whether the user group was imported by SCIM.
     * 
     */
    public Optional<Output<Boolean>> importedByScim() {
        return Optional.ofNullable(this.importedByScim);
    }

    /**
     * Indicates whether the user group is linked to an SSO provider.
     * 
     */
    @Import(name="isSsoLinked")
    private @Nullable Output<Boolean> isSsoLinked;

    /**
     * @return Indicates whether the user group is linked to an SSO provider.
     * 
     */
    public Optional<Output<Boolean>> isSsoLinked() {
        return Optional.ofNullable(this.isSsoLinked);
    }

    /**
     * The LDAP settings for the user group.
     * 
     */
    @Import(name="ldapSettings")
    private @Nullable Output<UserGroupLdapSettingsArgs> ldapSettings;

    /**
     * @return The LDAP settings for the user group.
     * 
     */
    public Optional<Output<UserGroupLdapSettingsArgs>> ldapSettings() {
        return Optional.ofNullable(this.ldapSettings);
    }

    /**
     * The name of the user group.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the user group.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The notification settings of the user group.
     * 
     */
    @Import(name="notificationSettings")
    private @Nullable Output<UserGroupNotificationSettingsArgs> notificationSettings;

    /**
     * @return The notification settings of the user group.
     * 
     */
    public Optional<Output<UserGroupNotificationSettingsArgs>> notificationSettings() {
        return Optional.ofNullable(this.notificationSettings);
    }

    /**
     * The permissions of the user group.
     * 
     */
    @Import(name="permissions")
    private @Nullable Output<UserGroupPermissionsArgs> permissions;

    /**
     * @return The permissions of the user group.
     * 
     */
    public Optional<Output<UserGroupPermissionsArgs>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    /**
     * The SAML settings for the user group.
     * 
     */
    @Import(name="samlSettings")
    private @Nullable Output<UserGroupSamlSettingsArgs> samlSettings;

    /**
     * @return The SAML settings for the user group.
     * 
     */
    public Optional<Output<UserGroupSamlSettingsArgs>> samlSettings() {
        return Optional.ofNullable(this.samlSettings);
    }

    private UserGroupState() {}

    private UserGroupState(UserGroupState $) {
        this.description = $.description;
        this.importedByScim = $.importedByScim;
        this.isSsoLinked = $.isSsoLinked;
        this.ldapSettings = $.ldapSettings;
        this.name = $.name;
        this.notificationSettings = $.notificationSettings;
        this.permissions = $.permissions;
        this.samlSettings = $.samlSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserGroupState $;

        public Builder() {
            $ = new UserGroupState();
        }

        public Builder(UserGroupState defaults) {
            $ = new UserGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the user group.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the user group.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param importedByScim Indicates whether the user group was imported by SCIM.
         * 
         * @return builder
         * 
         */
        public Builder importedByScim(@Nullable Output<Boolean> importedByScim) {
            $.importedByScim = importedByScim;
            return this;
        }

        /**
         * @param importedByScim Indicates whether the user group was imported by SCIM.
         * 
         * @return builder
         * 
         */
        public Builder importedByScim(Boolean importedByScim) {
            return importedByScim(Output.of(importedByScim));
        }

        /**
         * @param isSsoLinked Indicates whether the user group is linked to an SSO provider.
         * 
         * @return builder
         * 
         */
        public Builder isSsoLinked(@Nullable Output<Boolean> isSsoLinked) {
            $.isSsoLinked = isSsoLinked;
            return this;
        }

        /**
         * @param isSsoLinked Indicates whether the user group is linked to an SSO provider.
         * 
         * @return builder
         * 
         */
        public Builder isSsoLinked(Boolean isSsoLinked) {
            return isSsoLinked(Output.of(isSsoLinked));
        }

        /**
         * @param ldapSettings The LDAP settings for the user group.
         * 
         * @return builder
         * 
         */
        public Builder ldapSettings(@Nullable Output<UserGroupLdapSettingsArgs> ldapSettings) {
            $.ldapSettings = ldapSettings;
            return this;
        }

        /**
         * @param ldapSettings The LDAP settings for the user group.
         * 
         * @return builder
         * 
         */
        public Builder ldapSettings(UserGroupLdapSettingsArgs ldapSettings) {
            return ldapSettings(Output.of(ldapSettings));
        }

        /**
         * @param name The name of the user group.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the user group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notificationSettings The notification settings of the user group.
         * 
         * @return builder
         * 
         */
        public Builder notificationSettings(@Nullable Output<UserGroupNotificationSettingsArgs> notificationSettings) {
            $.notificationSettings = notificationSettings;
            return this;
        }

        /**
         * @param notificationSettings The notification settings of the user group.
         * 
         * @return builder
         * 
         */
        public Builder notificationSettings(UserGroupNotificationSettingsArgs notificationSettings) {
            return notificationSettings(Output.of(notificationSettings));
        }

        /**
         * @param permissions The permissions of the user group.
         * 
         * @return builder
         * 
         */
        public Builder permissions(@Nullable Output<UserGroupPermissionsArgs> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions The permissions of the user group.
         * 
         * @return builder
         * 
         */
        public Builder permissions(UserGroupPermissionsArgs permissions) {
            return permissions(Output.of(permissions));
        }

        /**
         * @param samlSettings The SAML settings for the user group.
         * 
         * @return builder
         * 
         */
        public Builder samlSettings(@Nullable Output<UserGroupSamlSettingsArgs> samlSettings) {
            $.samlSettings = samlSettings;
            return this;
        }

        /**
         * @param samlSettings The SAML settings for the user group.
         * 
         * @return builder
         * 
         */
        public Builder samlSettings(UserGroupSamlSettingsArgs samlSettings) {
            return samlSettings(Output.of(samlSettings));
        }

        public UserGroupState build() {
            return $;
        }
    }

}
