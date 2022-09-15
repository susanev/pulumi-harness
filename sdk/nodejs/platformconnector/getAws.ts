// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Datasource for looking up an AWS connector.
 */
export function getAws(args?: GetAwsArgs, opts?: pulumi.InvokeOptions): Promise<GetAwsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("harness:PlatformConnector/getAws:getAws", {
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAws.
 */
export interface GetAwsArgs {
    /**
     * Unique identifier of the resource.
     */
    identifier?: string;
    /**
     * Name of the resource.
     */
    name?: string;
    /**
     * Unique identifier of the organization.
     */
    orgId?: string;
    /**
     * Unique identifier of the project.
     */
    projectId?: string;
}

/**
 * A collection of values returned by getAws.
 */
export interface GetAwsResult {
    /**
     * Select this option if you want to use one AWS account for the connection, but you want to deploy or build in a different AWS account. In this scenario, the AWS account used for AWS access in Credentials will assume the IAM role you specify in Cross-account role ARN setting. This option uses the AWS Security Token Service (STS) feature.
     */
    readonly crossAccountAccesses: outputs.PlatformConnector.GetAwsCrossAccountAccess[];
    /**
     * Description of the resource.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Unique identifier of the resource.
     */
    readonly identifier?: string;
    /**
     * Inherit credentials from the delegate.
     */
    readonly inheritFromDelegates: outputs.PlatformConnector.GetAwsInheritFromDelegate[];
    /**
     * Use IAM role for service accounts.
     */
    readonly irsas: outputs.PlatformConnector.GetAwsIrsa[];
    /**
     * Use IAM role for service accounts.
     */
    readonly manuals: outputs.PlatformConnector.GetAwsManual[];
    /**
     * Name of the resource.
     */
    readonly name?: string;
    /**
     * Unique identifier of the organization.
     */
    readonly orgId?: string;
    /**
     * Unique identifier of the project.
     */
    readonly projectId?: string;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    readonly tags: string[];
}

export function getAwsOutput(args?: GetAwsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAwsResult> {
    return pulumi.output(args).apply(a => getAws(a, opts))
}

/**
 * A collection of arguments for invoking getAws.
 */
export interface GetAwsOutputArgs {
    /**
     * Unique identifier of the resource.
     */
    identifier?: pulumi.Input<string>;
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
}
