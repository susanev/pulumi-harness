// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VaultConnectorState extends com.pulumi.resources.ResourceArgs {

    public static final VaultConnectorState Empty = new VaultConnectorState();

    /**
     * Access type.
     * 
     */
    @Import(name="accessType")
    private @Nullable Output<String> accessType;

    /**
     * @return Access type.
     * 
     */
    public Optional<Output<String>> accessType() {
        return Optional.ofNullable(this.accessType);
    }

    /**
     * ID of App Role.
     * 
     */
    @Import(name="appRoleId")
    private @Nullable Output<String> appRoleId;

    /**
     * @return ID of App Role.
     * 
     */
    public Optional<Output<String>> appRoleId() {
        return Optional.ofNullable(this.appRoleId);
    }

    /**
     * Authentication token for Vault.
     * 
     */
    @Import(name="authToken")
    private @Nullable Output<String> authToken;

    /**
     * @return Authentication token for Vault.
     * 
     */
    public Optional<Output<String>> authToken() {
        return Optional.ofNullable(this.authToken);
    }

    /**
     * AWS region where the AWS IAM authentication will happen.
     * 
     */
    @Import(name="awsRegion")
    private @Nullable Output<String> awsRegion;

    /**
     * @return AWS region where the AWS IAM authentication will happen.
     * 
     */
    public Optional<Output<String>> awsRegion() {
        return Optional.ofNullable(this.awsRegion);
    }

    /**
     * Location of the Vault directory where the secret will be stored.
     * 
     */
    @Import(name="basePath")
    private @Nullable Output<String> basePath;

    /**
     * @return Location of the Vault directory where the secret will be stored.
     * 
     */
    public Optional<Output<String>> basePath() {
        return Optional.ofNullable(this.basePath);
    }

    /**
     * Is default or not.
     * 
     */
    @Import(name="default")
    private @Nullable Output<Boolean> default_;

    /**
     * @return Is default or not.
     * 
     */
    public Optional<Output<Boolean>> default_() {
        return Optional.ofNullable(this.default_);
    }

    /**
     * List of Delegate Selectors that belong to the same Delegate and are used to connect to the Secret Manager.
     * 
     */
    @Import(name="delegateSelectors")
    private @Nullable Output<List<String>> delegateSelectors;

    /**
     * @return List of Delegate Selectors that belong to the same Delegate and are used to connect to the Secret Manager.
     * 
     */
    public Optional<Output<List<String>>> delegateSelectors() {
        return Optional.ofNullable(this.delegateSelectors);
    }

    /**
     * Description of the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Unique identifier of the resource.
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return Unique identifier of the resource.
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * Is default or not.
     * 
     */
    @Import(name="isDefault")
    private @Nullable Output<Boolean> isDefault;

    /**
     * @return Is default or not.
     * 
     */
    public Optional<Output<Boolean>> isDefault() {
        return Optional.ofNullable(this.isDefault);
    }

    /**
     * Read only or not.
     * 
     */
    @Import(name="isReadOnly")
    private @Nullable Output<Boolean> isReadOnly;

    /**
     * @return Read only or not.
     * 
     */
    public Optional<Output<Boolean>> isReadOnly() {
        return Optional.ofNullable(this.isReadOnly);
    }

    /**
     * The path where Kubernetes Auth is enabled in Vault.
     * 
     */
    @Import(name="k8sAuthEndpoint")
    private @Nullable Output<String> k8sAuthEndpoint;

    /**
     * @return The path where Kubernetes Auth is enabled in Vault.
     * 
     */
    public Optional<Output<String>> k8sAuthEndpoint() {
        return Optional.ofNullable(this.k8sAuthEndpoint);
    }

    /**
     * Name of the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Vault namespace where the Secret will be created.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return Vault namespace where the Secret will be created.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * Unique identifier of the Organization.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Unique identifier of the Organization.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Unique identifier of the Project.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Unique identifier of the Project.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Read only.
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    /**
     * @return Read only.
     * 
     */
    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    /**
     * Boolean value to indicate if AppRole token renewal is enabled or not.
     * 
     */
    @Import(name="renewAppRoleToken")
    private @Nullable Output<Boolean> renewAppRoleToken;

    /**
     * @return Boolean value to indicate if AppRole token renewal is enabled or not.
     * 
     */
    public Optional<Output<Boolean>> renewAppRoleToken() {
        return Optional.ofNullable(this.renewAppRoleToken);
    }

    /**
     * The time interval for the token renewal.
     * 
     */
    @Import(name="renewalIntervalMinutes")
    private @Nullable Output<Integer> renewalIntervalMinutes;

    /**
     * @return The time interval for the token renewal.
     * 
     */
    public Optional<Output<Integer>> renewalIntervalMinutes() {
        return Optional.ofNullable(this.renewalIntervalMinutes);
    }

    /**
     * Manually entered Secret Engine.
     * 
     */
    @Import(name="secretEngineManuallyConfigured")
    private @Nullable Output<Boolean> secretEngineManuallyConfigured;

    /**
     * @return Manually entered Secret Engine.
     * 
     */
    public Optional<Output<Boolean>> secretEngineManuallyConfigured() {
        return Optional.ofNullable(this.secretEngineManuallyConfigured);
    }

    /**
     * Name of the Secret Engine.
     * 
     */
    @Import(name="secretEngineName")
    private @Nullable Output<String> secretEngineName;

    /**
     * @return Name of the Secret Engine.
     * 
     */
    public Optional<Output<String>> secretEngineName() {
        return Optional.ofNullable(this.secretEngineName);
    }

    /**
     * Version of Secret Engine.
     * 
     */
    @Import(name="secretEngineVersion")
    private @Nullable Output<Integer> secretEngineVersion;

    /**
     * @return Version of Secret Engine.
     * 
     */
    public Optional<Output<Integer>> secretEngineVersion() {
        return Optional.ofNullable(this.secretEngineVersion);
    }

    /**
     * ID of the Secret.
     * 
     */
    @Import(name="secretId")
    private @Nullable Output<String> secretId;

    /**
     * @return ID of the Secret.
     * 
     */
    public Optional<Output<String>> secretId() {
        return Optional.ofNullable(this.secretId);
    }

    /**
     * The Service Account token path in the K8s pod where the token is mounted.
     * 
     */
    @Import(name="serviceAccountTokenPath")
    private @Nullable Output<String> serviceAccountTokenPath;

    /**
     * @return The Service Account token path in the K8s pod where the token is mounted.
     * 
     */
    public Optional<Output<String>> serviceAccountTokenPath() {
        return Optional.ofNullable(this.serviceAccountTokenPath);
    }

    /**
     * The location from which the authentication token should be read.
     * 
     */
    @Import(name="sinkPath")
    private @Nullable Output<String> sinkPath;

    /**
     * @return The location from which the authentication token should be read.
     * 
     */
    public Optional<Output<String>> sinkPath() {
        return Optional.ofNullable(this.sinkPath);
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

    /**
     * Boolean value to indicate if AWS IAM is used for authentication.
     * 
     */
    @Import(name="useAwsIam")
    private @Nullable Output<Boolean> useAwsIam;

    /**
     * @return Boolean value to indicate if AWS IAM is used for authentication.
     * 
     */
    public Optional<Output<Boolean>> useAwsIam() {
        return Optional.ofNullable(this.useAwsIam);
    }

    /**
     * Boolean value to indicate if K8s Auth is used for authentication.
     * 
     */
    @Import(name="useK8sAuth")
    private @Nullable Output<Boolean> useK8sAuth;

    /**
     * @return Boolean value to indicate if K8s Auth is used for authentication.
     * 
     */
    public Optional<Output<Boolean>> useK8sAuth() {
        return Optional.ofNullable(this.useK8sAuth);
    }

    /**
     * Boolean value to indicate if Vault Agent is used for authentication.
     * 
     */
    @Import(name="useVaultAgent")
    private @Nullable Output<Boolean> useVaultAgent;

    /**
     * @return Boolean value to indicate if Vault Agent is used for authentication.
     * 
     */
    public Optional<Output<Boolean>> useVaultAgent() {
        return Optional.ofNullable(this.useVaultAgent);
    }

    /**
     * The Vault role defined to bind to aws iam account/role being accessed.
     * 
     */
    @Import(name="vaultAwsIamRole")
    private @Nullable Output<String> vaultAwsIamRole;

    /**
     * @return The Vault role defined to bind to aws iam account/role being accessed.
     * 
     */
    public Optional<Output<String>> vaultAwsIamRole() {
        return Optional.ofNullable(this.vaultAwsIamRole);
    }

    /**
     * The role where K8s Auth will happen.
     * 
     */
    @Import(name="vaultK8sAuthRole")
    private @Nullable Output<String> vaultK8sAuthRole;

    /**
     * @return The role where K8s Auth will happen.
     * 
     */
    public Optional<Output<String>> vaultK8sAuthRole() {
        return Optional.ofNullable(this.vaultK8sAuthRole);
    }

    /**
     * URL of the HashiCorp Vault.
     * 
     */
    @Import(name="vaultUrl")
    private @Nullable Output<String> vaultUrl;

    /**
     * @return URL of the HashiCorp Vault.
     * 
     */
    public Optional<Output<String>> vaultUrl() {
        return Optional.ofNullable(this.vaultUrl);
    }

    /**
     * The AWS IAM Header Server ID that has been configured for this AWS IAM instance.
     * 
     */
    @Import(name="xvaultAwsIamServerId")
    private @Nullable Output<String> xvaultAwsIamServerId;

    /**
     * @return The AWS IAM Header Server ID that has been configured for this AWS IAM instance.
     * 
     */
    public Optional<Output<String>> xvaultAwsIamServerId() {
        return Optional.ofNullable(this.xvaultAwsIamServerId);
    }

    private VaultConnectorState() {}

    private VaultConnectorState(VaultConnectorState $) {
        this.accessType = $.accessType;
        this.appRoleId = $.appRoleId;
        this.authToken = $.authToken;
        this.awsRegion = $.awsRegion;
        this.basePath = $.basePath;
        this.default_ = $.default_;
        this.delegateSelectors = $.delegateSelectors;
        this.description = $.description;
        this.identifier = $.identifier;
        this.isDefault = $.isDefault;
        this.isReadOnly = $.isReadOnly;
        this.k8sAuthEndpoint = $.k8sAuthEndpoint;
        this.name = $.name;
        this.namespace = $.namespace;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.readOnly = $.readOnly;
        this.renewAppRoleToken = $.renewAppRoleToken;
        this.renewalIntervalMinutes = $.renewalIntervalMinutes;
        this.secretEngineManuallyConfigured = $.secretEngineManuallyConfigured;
        this.secretEngineName = $.secretEngineName;
        this.secretEngineVersion = $.secretEngineVersion;
        this.secretId = $.secretId;
        this.serviceAccountTokenPath = $.serviceAccountTokenPath;
        this.sinkPath = $.sinkPath;
        this.tags = $.tags;
        this.useAwsIam = $.useAwsIam;
        this.useK8sAuth = $.useK8sAuth;
        this.useVaultAgent = $.useVaultAgent;
        this.vaultAwsIamRole = $.vaultAwsIamRole;
        this.vaultK8sAuthRole = $.vaultK8sAuthRole;
        this.vaultUrl = $.vaultUrl;
        this.xvaultAwsIamServerId = $.xvaultAwsIamServerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VaultConnectorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VaultConnectorState $;

        public Builder() {
            $ = new VaultConnectorState();
        }

        public Builder(VaultConnectorState defaults) {
            $ = new VaultConnectorState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessType Access type.
         * 
         * @return builder
         * 
         */
        public Builder accessType(@Nullable Output<String> accessType) {
            $.accessType = accessType;
            return this;
        }

        /**
         * @param accessType Access type.
         * 
         * @return builder
         * 
         */
        public Builder accessType(String accessType) {
            return accessType(Output.of(accessType));
        }

        /**
         * @param appRoleId ID of App Role.
         * 
         * @return builder
         * 
         */
        public Builder appRoleId(@Nullable Output<String> appRoleId) {
            $.appRoleId = appRoleId;
            return this;
        }

        /**
         * @param appRoleId ID of App Role.
         * 
         * @return builder
         * 
         */
        public Builder appRoleId(String appRoleId) {
            return appRoleId(Output.of(appRoleId));
        }

        /**
         * @param authToken Authentication token for Vault.
         * 
         * @return builder
         * 
         */
        public Builder authToken(@Nullable Output<String> authToken) {
            $.authToken = authToken;
            return this;
        }

        /**
         * @param authToken Authentication token for Vault.
         * 
         * @return builder
         * 
         */
        public Builder authToken(String authToken) {
            return authToken(Output.of(authToken));
        }

        /**
         * @param awsRegion AWS region where the AWS IAM authentication will happen.
         * 
         * @return builder
         * 
         */
        public Builder awsRegion(@Nullable Output<String> awsRegion) {
            $.awsRegion = awsRegion;
            return this;
        }

        /**
         * @param awsRegion AWS region where the AWS IAM authentication will happen.
         * 
         * @return builder
         * 
         */
        public Builder awsRegion(String awsRegion) {
            return awsRegion(Output.of(awsRegion));
        }

        /**
         * @param basePath Location of the Vault directory where the secret will be stored.
         * 
         * @return builder
         * 
         */
        public Builder basePath(@Nullable Output<String> basePath) {
            $.basePath = basePath;
            return this;
        }

        /**
         * @param basePath Location of the Vault directory where the secret will be stored.
         * 
         * @return builder
         * 
         */
        public Builder basePath(String basePath) {
            return basePath(Output.of(basePath));
        }

        /**
         * @param default_ Is default or not.
         * 
         * @return builder
         * 
         */
        public Builder default_(@Nullable Output<Boolean> default_) {
            $.default_ = default_;
            return this;
        }

        /**
         * @param default_ Is default or not.
         * 
         * @return builder
         * 
         */
        public Builder default_(Boolean default_) {
            return default_(Output.of(default_));
        }

        /**
         * @param delegateSelectors List of Delegate Selectors that belong to the same Delegate and are used to connect to the Secret Manager.
         * 
         * @return builder
         * 
         */
        public Builder delegateSelectors(@Nullable Output<List<String>> delegateSelectors) {
            $.delegateSelectors = delegateSelectors;
            return this;
        }

        /**
         * @param delegateSelectors List of Delegate Selectors that belong to the same Delegate and are used to connect to the Secret Manager.
         * 
         * @return builder
         * 
         */
        public Builder delegateSelectors(List<String> delegateSelectors) {
            return delegateSelectors(Output.of(delegateSelectors));
        }

        /**
         * @param delegateSelectors List of Delegate Selectors that belong to the same Delegate and are used to connect to the Secret Manager.
         * 
         * @return builder
         * 
         */
        public Builder delegateSelectors(String... delegateSelectors) {
            return delegateSelectors(List.of(delegateSelectors));
        }

        /**
         * @param description Description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param isDefault Is default or not.
         * 
         * @return builder
         * 
         */
        public Builder isDefault(@Nullable Output<Boolean> isDefault) {
            $.isDefault = isDefault;
            return this;
        }

        /**
         * @param isDefault Is default or not.
         * 
         * @return builder
         * 
         */
        public Builder isDefault(Boolean isDefault) {
            return isDefault(Output.of(isDefault));
        }

        /**
         * @param isReadOnly Read only or not.
         * 
         * @return builder
         * 
         */
        public Builder isReadOnly(@Nullable Output<Boolean> isReadOnly) {
            $.isReadOnly = isReadOnly;
            return this;
        }

        /**
         * @param isReadOnly Read only or not.
         * 
         * @return builder
         * 
         */
        public Builder isReadOnly(Boolean isReadOnly) {
            return isReadOnly(Output.of(isReadOnly));
        }

        /**
         * @param k8sAuthEndpoint The path where Kubernetes Auth is enabled in Vault.
         * 
         * @return builder
         * 
         */
        public Builder k8sAuthEndpoint(@Nullable Output<String> k8sAuthEndpoint) {
            $.k8sAuthEndpoint = k8sAuthEndpoint;
            return this;
        }

        /**
         * @param k8sAuthEndpoint The path where Kubernetes Auth is enabled in Vault.
         * 
         * @return builder
         * 
         */
        public Builder k8sAuthEndpoint(String k8sAuthEndpoint) {
            return k8sAuthEndpoint(Output.of(k8sAuthEndpoint));
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespace Vault namespace where the Secret will be created.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace Vault namespace where the Secret will be created.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param orgId Unique identifier of the Organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Unique identifier of the Organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Unique identifier of the Project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique identifier of the Project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param readOnly Read only.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        /**
         * @param readOnly Read only.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        /**
         * @param renewAppRoleToken Boolean value to indicate if AppRole token renewal is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder renewAppRoleToken(@Nullable Output<Boolean> renewAppRoleToken) {
            $.renewAppRoleToken = renewAppRoleToken;
            return this;
        }

        /**
         * @param renewAppRoleToken Boolean value to indicate if AppRole token renewal is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder renewAppRoleToken(Boolean renewAppRoleToken) {
            return renewAppRoleToken(Output.of(renewAppRoleToken));
        }

        /**
         * @param renewalIntervalMinutes The time interval for the token renewal.
         * 
         * @return builder
         * 
         */
        public Builder renewalIntervalMinutes(@Nullable Output<Integer> renewalIntervalMinutes) {
            $.renewalIntervalMinutes = renewalIntervalMinutes;
            return this;
        }

        /**
         * @param renewalIntervalMinutes The time interval for the token renewal.
         * 
         * @return builder
         * 
         */
        public Builder renewalIntervalMinutes(Integer renewalIntervalMinutes) {
            return renewalIntervalMinutes(Output.of(renewalIntervalMinutes));
        }

        /**
         * @param secretEngineManuallyConfigured Manually entered Secret Engine.
         * 
         * @return builder
         * 
         */
        public Builder secretEngineManuallyConfigured(@Nullable Output<Boolean> secretEngineManuallyConfigured) {
            $.secretEngineManuallyConfigured = secretEngineManuallyConfigured;
            return this;
        }

        /**
         * @param secretEngineManuallyConfigured Manually entered Secret Engine.
         * 
         * @return builder
         * 
         */
        public Builder secretEngineManuallyConfigured(Boolean secretEngineManuallyConfigured) {
            return secretEngineManuallyConfigured(Output.of(secretEngineManuallyConfigured));
        }

        /**
         * @param secretEngineName Name of the Secret Engine.
         * 
         * @return builder
         * 
         */
        public Builder secretEngineName(@Nullable Output<String> secretEngineName) {
            $.secretEngineName = secretEngineName;
            return this;
        }

        /**
         * @param secretEngineName Name of the Secret Engine.
         * 
         * @return builder
         * 
         */
        public Builder secretEngineName(String secretEngineName) {
            return secretEngineName(Output.of(secretEngineName));
        }

        /**
         * @param secretEngineVersion Version of Secret Engine.
         * 
         * @return builder
         * 
         */
        public Builder secretEngineVersion(@Nullable Output<Integer> secretEngineVersion) {
            $.secretEngineVersion = secretEngineVersion;
            return this;
        }

        /**
         * @param secretEngineVersion Version of Secret Engine.
         * 
         * @return builder
         * 
         */
        public Builder secretEngineVersion(Integer secretEngineVersion) {
            return secretEngineVersion(Output.of(secretEngineVersion));
        }

        /**
         * @param secretId ID of the Secret.
         * 
         * @return builder
         * 
         */
        public Builder secretId(@Nullable Output<String> secretId) {
            $.secretId = secretId;
            return this;
        }

        /**
         * @param secretId ID of the Secret.
         * 
         * @return builder
         * 
         */
        public Builder secretId(String secretId) {
            return secretId(Output.of(secretId));
        }

        /**
         * @param serviceAccountTokenPath The Service Account token path in the K8s pod where the token is mounted.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountTokenPath(@Nullable Output<String> serviceAccountTokenPath) {
            $.serviceAccountTokenPath = serviceAccountTokenPath;
            return this;
        }

        /**
         * @param serviceAccountTokenPath The Service Account token path in the K8s pod where the token is mounted.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountTokenPath(String serviceAccountTokenPath) {
            return serviceAccountTokenPath(Output.of(serviceAccountTokenPath));
        }

        /**
         * @param sinkPath The location from which the authentication token should be read.
         * 
         * @return builder
         * 
         */
        public Builder sinkPath(@Nullable Output<String> sinkPath) {
            $.sinkPath = sinkPath;
            return this;
        }

        /**
         * @param sinkPath The location from which the authentication token should be read.
         * 
         * @return builder
         * 
         */
        public Builder sinkPath(String sinkPath) {
            return sinkPath(Output.of(sinkPath));
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

        /**
         * @param useAwsIam Boolean value to indicate if AWS IAM is used for authentication.
         * 
         * @return builder
         * 
         */
        public Builder useAwsIam(@Nullable Output<Boolean> useAwsIam) {
            $.useAwsIam = useAwsIam;
            return this;
        }

        /**
         * @param useAwsIam Boolean value to indicate if AWS IAM is used for authentication.
         * 
         * @return builder
         * 
         */
        public Builder useAwsIam(Boolean useAwsIam) {
            return useAwsIam(Output.of(useAwsIam));
        }

        /**
         * @param useK8sAuth Boolean value to indicate if K8s Auth is used for authentication.
         * 
         * @return builder
         * 
         */
        public Builder useK8sAuth(@Nullable Output<Boolean> useK8sAuth) {
            $.useK8sAuth = useK8sAuth;
            return this;
        }

        /**
         * @param useK8sAuth Boolean value to indicate if K8s Auth is used for authentication.
         * 
         * @return builder
         * 
         */
        public Builder useK8sAuth(Boolean useK8sAuth) {
            return useK8sAuth(Output.of(useK8sAuth));
        }

        /**
         * @param useVaultAgent Boolean value to indicate if Vault Agent is used for authentication.
         * 
         * @return builder
         * 
         */
        public Builder useVaultAgent(@Nullable Output<Boolean> useVaultAgent) {
            $.useVaultAgent = useVaultAgent;
            return this;
        }

        /**
         * @param useVaultAgent Boolean value to indicate if Vault Agent is used for authentication.
         * 
         * @return builder
         * 
         */
        public Builder useVaultAgent(Boolean useVaultAgent) {
            return useVaultAgent(Output.of(useVaultAgent));
        }

        /**
         * @param vaultAwsIamRole The Vault role defined to bind to aws iam account/role being accessed.
         * 
         * @return builder
         * 
         */
        public Builder vaultAwsIamRole(@Nullable Output<String> vaultAwsIamRole) {
            $.vaultAwsIamRole = vaultAwsIamRole;
            return this;
        }

        /**
         * @param vaultAwsIamRole The Vault role defined to bind to aws iam account/role being accessed.
         * 
         * @return builder
         * 
         */
        public Builder vaultAwsIamRole(String vaultAwsIamRole) {
            return vaultAwsIamRole(Output.of(vaultAwsIamRole));
        }

        /**
         * @param vaultK8sAuthRole The role where K8s Auth will happen.
         * 
         * @return builder
         * 
         */
        public Builder vaultK8sAuthRole(@Nullable Output<String> vaultK8sAuthRole) {
            $.vaultK8sAuthRole = vaultK8sAuthRole;
            return this;
        }

        /**
         * @param vaultK8sAuthRole The role where K8s Auth will happen.
         * 
         * @return builder
         * 
         */
        public Builder vaultK8sAuthRole(String vaultK8sAuthRole) {
            return vaultK8sAuthRole(Output.of(vaultK8sAuthRole));
        }

        /**
         * @param vaultUrl URL of the HashiCorp Vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultUrl(@Nullable Output<String> vaultUrl) {
            $.vaultUrl = vaultUrl;
            return this;
        }

        /**
         * @param vaultUrl URL of the HashiCorp Vault.
         * 
         * @return builder
         * 
         */
        public Builder vaultUrl(String vaultUrl) {
            return vaultUrl(Output.of(vaultUrl));
        }

        /**
         * @param xvaultAwsIamServerId The AWS IAM Header Server ID that has been configured for this AWS IAM instance.
         * 
         * @return builder
         * 
         */
        public Builder xvaultAwsIamServerId(@Nullable Output<String> xvaultAwsIamServerId) {
            $.xvaultAwsIamServerId = xvaultAwsIamServerId;
            return this;
        }

        /**
         * @param xvaultAwsIamServerId The AWS IAM Header Server ID that has been configured for this AWS IAM instance.
         * 
         * @return builder
         * 
         */
        public Builder xvaultAwsIamServerId(String xvaultAwsIamServerId) {
            return xvaultAwsIamServerId(Output.of(xvaultAwsIamServerId));
        }

        public VaultConnectorState build() {
            return $;
        }
    }

}
