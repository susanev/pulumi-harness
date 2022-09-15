// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Data source for retrieving a Harness service
 */
export function getService(args: GetServiceArgs, opts?: pulumi.InvokeOptions): Promise<GetServiceResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("harness:index/getService:getService", {
        "appId": args.appId,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getService.
 */
export interface GetServiceArgs {
    /**
     * The id of the application the service belongs to
     */
    appId: string;
    /**
     * Unique identifier of the application
     */
    id: string;
}

/**
 * A collection of values returned by getService.
 */
export interface GetServiceResult {
    /**
     * The id of the application the service belongs to
     */
    readonly appId: string;
    /**
     * The type of artifact deployed by the service
     */
    readonly artifactType: string;
    /**
     * The application description
     */
    readonly description: string;
    /**
     * The version of Helm being used by the service.
     */
    readonly helmVersion: string;
    /**
     * Unique identifier of the application
     */
    readonly id: string;
    /**
     * The name of the service
     */
    readonly name: string;
    /**
     * Tags for the service
     */
    readonly tags: {[key: string]: string};
    /**
     * The path of the template used for the custom deployment
     */
    readonly templateUri: string;
    /**
     * The type of the deployment
     */
    readonly type: string;
}

export function getServiceOutput(args: GetServiceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServiceResult> {
    return pulumi.output(args).apply(a => getService(a, opts))
}

/**
 * A collection of arguments for invoking getService.
 */
export interface GetServiceOutputArgs {
    /**
     * The id of the application the service belongs to
     */
    appId: pulumi.Input<string>;
    /**
     * Unique identifier of the application
     */
    id: pulumi.Input<string>;
}
