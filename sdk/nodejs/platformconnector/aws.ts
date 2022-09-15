// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Resource for creating an AWS connector.
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
    public static readonly __pulumiType = 'harness:PlatformConnector/aws:Aws';

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
     * Select this option if you want to use one AWS account for the connection, but you want to deploy or build in a different AWS account. In this scenario, the AWS account used for AWS access in Credentials will assume the IAM role you specify in Cross-account role ARN setting. This option uses the AWS Security Token Service (STS) feature.
     */
    public readonly crossAccountAccess!: pulumi.Output<outputs.PlatformConnector.AwsCrossAccountAccess | undefined>;
    /**
     * Description of the resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier of the resource.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * Inherit credentials from the delegate.
     */
    public readonly inheritFromDelegate!: pulumi.Output<outputs.PlatformConnector.AwsInheritFromDelegate | undefined>;
    /**
     * Use IAM role for service accounts.
     */
    public readonly irsa!: pulumi.Output<outputs.PlatformConnector.AwsIrsa | undefined>;
    /**
     * Use IAM role for service accounts.
     */
    public readonly manual!: pulumi.Output<outputs.PlatformConnector.AwsManual | undefined>;
    /**
     * Name of the resource.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Unique identifier of the organization.
     */
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier of the project.
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;

    /**
     * Create a Aws resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AwsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AwsArgs | AwsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AwsState | undefined;
            resourceInputs["crossAccountAccess"] = state ? state.crossAccountAccess : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["inheritFromDelegate"] = state ? state.inheritFromDelegate : undefined;
            resourceInputs["irsa"] = state ? state.irsa : undefined;
            resourceInputs["manual"] = state ? state.manual : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as AwsArgs | undefined;
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            resourceInputs["crossAccountAccess"] = args ? args.crossAccountAccess : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["inheritFromDelegate"] = args ? args.inheritFromDelegate : undefined;
            resourceInputs["irsa"] = args ? args.irsa : undefined;
            resourceInputs["manual"] = args ? args.manual : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
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
     * Select this option if you want to use one AWS account for the connection, but you want to deploy or build in a different AWS account. In this scenario, the AWS account used for AWS access in Credentials will assume the IAM role you specify in Cross-account role ARN setting. This option uses the AWS Security Token Service (STS) feature.
     */
    crossAccountAccess?: pulumi.Input<inputs.PlatformConnector.AwsCrossAccountAccess>;
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Unique identifier of the resource.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Inherit credentials from the delegate.
     */
    inheritFromDelegate?: pulumi.Input<inputs.PlatformConnector.AwsInheritFromDelegate>;
    /**
     * Use IAM role for service accounts.
     */
    irsa?: pulumi.Input<inputs.PlatformConnector.AwsIrsa>;
    /**
     * Use IAM role for service accounts.
     */
    manual?: pulumi.Input<inputs.PlatformConnector.AwsManual>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique identifier of the organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Aws resource.
 */
export interface AwsArgs {
    /**
     * Select this option if you want to use one AWS account for the connection, but you want to deploy or build in a different AWS account. In this scenario, the AWS account used for AWS access in Credentials will assume the IAM role you specify in Cross-account role ARN setting. This option uses the AWS Security Token Service (STS) feature.
     */
    crossAccountAccess?: pulumi.Input<inputs.PlatformConnector.AwsCrossAccountAccess>;
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Unique identifier of the resource.
     */
    identifier: pulumi.Input<string>;
    /**
     * Inherit credentials from the delegate.
     */
    inheritFromDelegate?: pulumi.Input<inputs.PlatformConnector.AwsInheritFromDelegate>;
    /**
     * Use IAM role for service accounts.
     */
    irsa?: pulumi.Input<inputs.PlatformConnector.AwsIrsa>;
    /**
     * Use IAM role for service accounts.
     */
    manual?: pulumi.Input<inputs.PlatformConnector.AwsManual>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique identifier of the organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}
