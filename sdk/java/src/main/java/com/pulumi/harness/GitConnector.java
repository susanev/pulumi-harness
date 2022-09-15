// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.GitConnectorArgs;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.inputs.GitConnectorState;
import com.pulumi.harness.outputs.GitConnectorCommitDetails;
import com.pulumi.harness.outputs.GitConnectorUsageScope;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a git connector
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.HarnessFunctions;
 * import com.pulumi.harness.inputs.GetSecretManagerArgs;
 * import com.pulumi.harness.EncryptedText;
 * import com.pulumi.harness.EncryptedTextArgs;
 * import com.pulumi.harness.GitConnector;
 * import com.pulumi.harness.GitConnectorArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var default = HarnessFunctions.getSecretManager(GetSecretManagerArgs.builder()
 *             .default_(true)
 *             .build());
 * 
 *         var exampleEncryptedText = new EncryptedText(&#34;exampleEncryptedText&#34;, EncryptedTextArgs.builder()        
 *             .value(&#34;foo&#34;)
 *             .secretManagerId(default_.id())
 *             .build());
 * 
 *         var exampleGitConnector = new GitConnector(&#34;exampleGitConnector&#34;, GitConnectorArgs.builder()        
 *             .url(&#34;https://github.com/harness/terraform-provider-harness&#34;)
 *             .branch(&#34;master&#34;)
 *             .generateWebhookUrl(true)
 *             .passwordSecretId(exampleEncryptedText.id())
 *             .urlType(&#34;REPO&#34;)
 *             .username(&#34;someuser&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * # Import using the Harness git connector id
 * 
 * ```sh
 *  $ pulumi import harness:index/gitConnector:GitConnector example &lt;connector_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:index/gitConnector:GitConnector")
public class GitConnector extends com.pulumi.resources.CustomResource {
    /**
     * The branch of the git connector to use
     * 
     */
    @Export(name="branch", type=String.class, parameters={})
    private Output</* @Nullable */ String> branch;

    /**
     * @return The branch of the git connector to use
     * 
     */
    public Output<Optional<String>> branch() {
        return Codegen.optional(this.branch);
    }
    /**
     * Custom details to use when making commits using this git connector
     * 
     */
    @Export(name="commitDetails", type=GitConnectorCommitDetails.class, parameters={})
    private Output</* @Nullable */ GitConnectorCommitDetails> commitDetails;

    /**
     * @return Custom details to use when making commits using this git connector
     * 
     */
    public Output<Optional<GitConnectorCommitDetails>> commitDetails() {
        return Codegen.optional(this.commitDetails);
    }
    /**
     * The time the git connector was created
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The time the git connector was created
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Delegate selectors to apply to this git connector.
     * 
     */
    @Export(name="delegateSelectors", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> delegateSelectors;

    /**
     * @return Delegate selectors to apply to this git connector.
     * 
     */
    public Output<Optional<List<String>>> delegateSelectors() {
        return Codegen.optional(this.delegateSelectors);
    }
    /**
     * Boolean indicating whether or not to generate a webhook url.
     * 
     */
    @Export(name="generateWebhookUrl", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> generateWebhookUrl;

    /**
     * @return Boolean indicating whether or not to generate a webhook url.
     * 
     */
    public Output<Optional<Boolean>> generateWebhookUrl() {
        return Codegen.optional(this.generateWebhookUrl);
    }
    /**
     * Name of the git connector.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the git connector.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The id of the secret for connecting to the git repository.
     * 
     */
    @Export(name="passwordSecretId", type=String.class, parameters={})
    private Output</* @Nullable */ String> passwordSecretId;

    /**
     * @return The id of the secret for connecting to the git repository.
     * 
     */
    public Output<Optional<String>> passwordSecretId() {
        return Codegen.optional(this.passwordSecretId);
    }
    /**
     * The id of the SSH secret to use
     * 
     */
    @Export(name="sshSettingId", type=String.class, parameters={})
    private Output</* @Nullable */ String> sshSettingId;

    /**
     * @return The id of the SSH secret to use
     * 
     */
    public Output<Optional<String>> sshSettingId() {
        return Codegen.optional(this.sshSettingId);
    }
    /**
     * The url of the git repository or account/organization
     * 
     */
    @Export(name="url", type=String.class, parameters={})
    private Output<String> url;

    /**
     * @return The url of the git repository or account/organization
     * 
     */
    public Output<String> url() {
        return this.url;
    }
    /**
     * The type of git url being used. Options are `ACCOUNT`, and `REPO.`
     * 
     */
    @Export(name="urlType", type=String.class, parameters={})
    private Output<String> urlType;

    /**
     * @return The type of git url being used. Options are `ACCOUNT`, and `REPO.`
     * 
     */
    public Output<String> urlType() {
        return this.urlType;
    }
    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     * 
     */
    @Export(name="usageScopes", type=List.class, parameters={GitConnectorUsageScope.class})
    private Output</* @Nullable */ List<GitConnectorUsageScope>> usageScopes;

    /**
     * @return This block is used for scoping the resource to a specific set of applications or environments.
     * 
     */
    public Output<Optional<List<GitConnectorUsageScope>>> usageScopes() {
        return Codegen.optional(this.usageScopes);
    }
    /**
     * The name of the user used to connect to the git repository
     * 
     */
    @Export(name="username", type=String.class, parameters={})
    private Output</* @Nullable */ String> username;

    /**
     * @return The name of the user used to connect to the git repository
     * 
     */
    public Output<Optional<String>> username() {
        return Codegen.optional(this.username);
    }
    /**
     * The generated webhook url
     * 
     */
    @Export(name="webhookUrl", type=String.class, parameters={})
    private Output<String> webhookUrl;

    /**
     * @return The generated webhook url
     * 
     */
    public Output<String> webhookUrl() {
        return this.webhookUrl;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GitConnector(String name) {
        this(name, GitConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GitConnector(String name, GitConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GitConnector(String name, GitConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:index/gitConnector:GitConnector", name, args == null ? GitConnectorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GitConnector(String name, Output<String> id, @Nullable GitConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:index/gitConnector:GitConnector", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static GitConnector get(String name, Output<String> id, @Nullable GitConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GitConnector(name, id, state, options);
    }
}
