// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Datasource for looking up an AWS Secret Manager connector.
 */
export function getAwsSecretManager(args?: GetAwsSecretManagerArgs, opts?: pulumi.InvokeOptions): Promise<GetAwsSecretManagerResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("harness:PlatformConnector/getAwsSecretManager:getAwsSecretManager", {
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAwsSecretManager.
 */
export interface GetAwsSecretManagerArgs {
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
 * A collection of values returned by getAwsSecretManager.
 */
export interface GetAwsSecretManagerResult {
    /**
     * The credentials to use for connecting to aws.
     */
    readonly credentials: outputs.PlatformConnector.GetAwsSecretManagerCredential[];
    /**
     * Connect using only the delegates which have these tags.
     */
    readonly delegateSelectors: string[];
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
     * The AWS region where the AWS Secret Manager is.
     */
    readonly region: string;
    /**
     * A prefix to be added to all secrets.
     */
    readonly secretNamePrefix: string;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    readonly tags: string[];
}

export function getAwsSecretManagerOutput(args?: GetAwsSecretManagerOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAwsSecretManagerResult> {
    return pulumi.output(args).apply(a => getAwsSecretManager(a, opts))
}

/**
 * A collection of arguments for invoking getAwsSecretManager.
 */
export interface GetAwsSecretManagerOutputArgs {
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
