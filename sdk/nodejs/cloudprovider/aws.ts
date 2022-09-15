// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Resource for creating an AWS cloud provider. This resource uses the config-as-code API's. When updating the `name` or `path` of this resource you should typically also set the `createBeforeDestroy = true` lifecycle setting.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@lbrlabs/pulumi-harness";
 * import * as harness from "@pulumi/harness";
 *
 * const default = harness.getSecretManager({
 *     "default": true,
 * });
 * const awsAccessKey = new harness.EncryptedText("awsAccessKey", {
 *     value: "<ACCESS_KEY_ID>",
 *     secretManagerId: _default.then(_default => _default.id),
 * });
 * const awsSecretKey = new harness.EncryptedText("awsSecretKey", {
 *     value: "<SECRET_KEY_ID>",
 *     secretManagerId: _default.then(_default => _default.id),
 * });
 * const aws = new harness.cloudprovider.Aws("aws", {
 *     accessKeyIdSecretName: awsAccessKey.name,
 *     secretAccessKeySecretName: awsSecretKey.name,
 * });
 * ```
 *
 * ## Import
 *
 * # Import using the Harness aws cloud provider id.
 *
 * ```sh
 *  $ pulumi import harness:Cloudprovider/aws:Aws example <provider_id>
 * ```
 */
export class Aws extends pulumi.CustomResource {
    /**
     * Get an existing Aws resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AwsState, opts?: pulumi.CustomResourceOptions): Aws {
        return new Aws(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:Cloudprovider/aws:Aws';

    /**
     * Returns true if the given object is an instance of Aws.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Aws {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Aws.__pulumiType;
    }

    /**
     * The plain text AWS access key id.
     */
    public readonly accessKeyId!: pulumi.Output<string | undefined>;
    /**
     * The name of the Harness secret containing the AWS access key id
     */
    public readonly accessKeyIdSecretName!: pulumi.Output<string | undefined>;
    /**
     * Configuration for assuming a cross account role.
     */
    public readonly assumeCrossAccountRole!: pulumi.Output<outputs.Cloudprovider.AwsAssumeCrossAccountRole | undefined>;
    /**
     * Select the Delegate to use via one of its Selectors.
     */
    public readonly delegateSelector!: pulumi.Output<string | undefined>;
    /**
     * The name of the cloud provider.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the Harness secret containing the AWS secret access key.
     */
    public readonly secretAccessKeySecretName!: pulumi.Output<string | undefined>;
    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     */
    public readonly usageScopes!: pulumi.Output<outputs.Cloudprovider.AwsUsageScope[] | undefined>;
    /**
     * Use the EC2 Instance Profile for Service Accounts.
     */
    public readonly useEc2IamCredentials!: pulumi.Output<boolean | undefined>;
    /**
     * Use the AWS IAM Role for Service Accounts.
     */
    public readonly useIrsa!: pulumi.Output<boolean | undefined>;

    /**
     * Create a Aws resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AwsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AwsArgs | AwsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AwsState | undefined;
            resourceInputs["accessKeyId"] = state ? state.accessKeyId : undefined;
            resourceInputs["accessKeyIdSecretName"] = state ? state.accessKeyIdSecretName : undefined;
            resourceInputs["assumeCrossAccountRole"] = state ? state.assumeCrossAccountRole : undefined;
            resourceInputs["delegateSelector"] = state ? state.delegateSelector : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["secretAccessKeySecretName"] = state ? state.secretAccessKeySecretName : undefined;
            resourceInputs["usageScopes"] = state ? state.usageScopes : undefined;
            resourceInputs["useEc2IamCredentials"] = state ? state.useEc2IamCredentials : undefined;
            resourceInputs["useIrsa"] = state ? state.useIrsa : undefined;
        } else {
            const args = argsOrState as AwsArgs | undefined;
            resourceInputs["accessKeyId"] = args ? args.accessKeyId : undefined;
            resourceInputs["accessKeyIdSecretName"] = args ? args.accessKeyIdSecretName : undefined;
            resourceInputs["assumeCrossAccountRole"] = args ? args.assumeCrossAccountRole : undefined;
            resourceInputs["delegateSelector"] = args ? args.delegateSelector : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["secretAccessKeySecretName"] = args ? args.secretAccessKeySecretName : undefined;
            resourceInputs["usageScopes"] = args ? args.usageScopes : undefined;
            resourceInputs["useEc2IamCredentials"] = args ? args.useEc2IamCredentials : undefined;
            resourceInputs["useIrsa"] = args ? args.useIrsa : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Aws.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Aws resources.
 */
export interface AwsState {
    /**
     * The plain text AWS access key id.
     */
    accessKeyId?: pulumi.Input<string>;
    /**
     * The name of the Harness secret containing the AWS access key id
     */
    accessKeyIdSecretName?: pulumi.Input<string>;
    /**
     * Configuration for assuming a cross account role.
     */
    assumeCrossAccountRole?: pulumi.Input<inputs.Cloudprovider.AwsAssumeCrossAccountRole>;
    /**
     * Select the Delegate to use via one of its Selectors.
     */
    delegateSelector?: pulumi.Input<string>;
    /**
     * The name of the cloud provider.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the Harness secret containing the AWS secret access key.
     */
    secretAccessKeySecretName?: pulumi.Input<string>;
    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     */
    usageScopes?: pulumi.Input<pulumi.Input<inputs.Cloudprovider.AwsUsageScope>[]>;
    /**
     * Use the EC2 Instance Profile for Service Accounts.
     */
    useEc2IamCredentials?: pulumi.Input<boolean>;
    /**
     * Use the AWS IAM Role for Service Accounts.
     */
    useIrsa?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Aws resource.
 */
export interface AwsArgs {
    /**
     * The plain text AWS access key id.
     */
    accessKeyId?: pulumi.Input<string>;
    /**
     * The name of the Harness secret containing the AWS access key id
     */
    accessKeyIdSecretName?: pulumi.Input<string>;
    /**
     * Configuration for assuming a cross account role.
     */
    assumeCrossAccountRole?: pulumi.Input<inputs.Cloudprovider.AwsAssumeCrossAccountRole>;
    /**
     * Select the Delegate to use via one of its Selectors.
     */
    delegateSelector?: pulumi.Input<string>;
    /**
     * The name of the cloud provider.
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the Harness secret containing the AWS secret access key.
     */
    secretAccessKeySecretName?: pulumi.Input<string>;
    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     */
    usageScopes?: pulumi.Input<pulumi.Input<inputs.Cloudprovider.AwsUsageScope>[]>;
    /**
     * Use the EC2 Instance Profile for Service Accounts.
     */
    useEc2IamCredentials?: pulumi.Input<boolean>;
    /**
     * Use the AWS IAM Role for Service Accounts.
     */
    useIrsa?: pulumi.Input<boolean>;
}
