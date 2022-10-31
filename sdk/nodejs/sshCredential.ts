// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Resource for creating an encrypted text secret
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@lbrlabs/pulumi-harness";
 * import * as harness from "@pulumi/harness";
 * import * as tls from "@pulumi/tls";
 *
 * const harnessDeployKey = new tls.PrivateKey("harnessDeployKey", {
 *     algorithm: "RSA",
 *     rsaBits: 4096,
 * });
 * const secretManager = harness.getSecretManager({
 *     "default": true,
 * });
 * const mySecret = new harness.EncryptedText("mySecret", {
 *     value: harnessDeployKey.privateKeyPem,
 *     secretManagerId: secretManager.then(secretManager => secretManager.id),
 * });
 * const sshCreds = new harness.SshCredential("sshCreds", {sshAuthentication: {
 *     port: 22,
 *     username: "git",
 *     inlineSsh: {
 *         sshKeyFileId: mySecret.id,
 *     },
 * }});
 * ```
 *
 * ## Import
 *
 * Import using the Harness ssh credential id
 *
 * ```sh
 *  $ pulumi import harness:index/sshCredential:SshCredential example <credential_id>
 * ```
 */
export class SshCredential extends pulumi.CustomResource {
    /**
     * Get an existing SshCredential resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SshCredentialState, opts?: pulumi.CustomResourceOptions): SshCredential {
        return new SshCredential(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:index/sshCredential:SshCredential';

    /**
     * Returns true if the given object is an instance of SshCredential.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SshCredential {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SshCredential.__pulumiType;
    }

    /**
     * Kerberos authentication for SSH. Cannot be used if ssh*authentication is specified
     */
    public readonly kerberosAuthentication!: pulumi.Output<outputs.SshCredentialKerberosAuthentication | undefined>;
    /**
     * Name of the encrypted text secret
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Authentication method for SSH. Cannot be used if kerberos*authentication is specified. Only one of `inlineSsh`, `serverPassword`, or `sshKeyFile` should be set
     */
    public readonly sshAuthentication!: pulumi.Output<outputs.SshCredentialSshAuthentication | undefined>;
    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     */
    public readonly usageScopes!: pulumi.Output<outputs.SshCredentialUsageScope[] | undefined>;

    /**
     * Create a SshCredential resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: SshCredentialArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SshCredentialArgs | SshCredentialState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SshCredentialState | undefined;
            resourceInputs["kerberosAuthentication"] = state ? state.kerberosAuthentication : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["sshAuthentication"] = state ? state.sshAuthentication : undefined;
            resourceInputs["usageScopes"] = state ? state.usageScopes : undefined;
        } else {
            const args = argsOrState as SshCredentialArgs | undefined;
            resourceInputs["kerberosAuthentication"] = args ? args.kerberosAuthentication : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["sshAuthentication"] = args ? args.sshAuthentication : undefined;
            resourceInputs["usageScopes"] = args ? args.usageScopes : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SshCredential.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SshCredential resources.
 */
export interface SshCredentialState {
    /**
     * Kerberos authentication for SSH. Cannot be used if ssh*authentication is specified
     */
    kerberosAuthentication?: pulumi.Input<inputs.SshCredentialKerberosAuthentication>;
    /**
     * Name of the encrypted text secret
     */
    name?: pulumi.Input<string>;
    /**
     * Authentication method for SSH. Cannot be used if kerberos*authentication is specified. Only one of `inlineSsh`, `serverPassword`, or `sshKeyFile` should be set
     */
    sshAuthentication?: pulumi.Input<inputs.SshCredentialSshAuthentication>;
    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     */
    usageScopes?: pulumi.Input<pulumi.Input<inputs.SshCredentialUsageScope>[]>;
}

/**
 * The set of arguments for constructing a SshCredential resource.
 */
export interface SshCredentialArgs {
    /**
     * Kerberos authentication for SSH. Cannot be used if ssh*authentication is specified
     */
    kerberosAuthentication?: pulumi.Input<inputs.SshCredentialKerberosAuthentication>;
    /**
     * Name of the encrypted text secret
     */
    name?: pulumi.Input<string>;
    /**
     * Authentication method for SSH. Cannot be used if kerberos*authentication is specified. Only one of `inlineSsh`, `serverPassword`, or `sshKeyFile` should be set
     */
    sshAuthentication?: pulumi.Input<inputs.SshCredentialSshAuthentication>;
    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     */
    usageScopes?: pulumi.Input<pulumi.Input<inputs.SshCredentialUsageScope>[]>;
}
