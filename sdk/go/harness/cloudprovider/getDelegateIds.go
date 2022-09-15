// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudprovider

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get a list of delegate ID's matching the specified search criteria.
func GetDelegateIds(ctx *pulumi.Context, args *GetDelegateIdsArgs, opts ...pulumi.InvokeOption) (*GetDelegateIdsResult, error) {
	var rv GetDelegateIdsResult
	err := ctx.Invoke("harness:Cloudprovider/getDelegateIds:getDelegateIds", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDelegateIds.
type GetDelegateIdsArgs struct {
	// The name of the delegate to query for.
	Name *string `pulumi:"name"`
	// The status of the delegate to query for. Valid values are DELETED, ENABLED, WAITING*FOR*APPROVAL
	Status *string `pulumi:"status"`
	// The type of the delegate to query for. Valid values are DOCKER, ECS, HELM*DELEGATE, KUBERNETES, SHELL*SCRIPT
	Type *string `pulumi:"type"`
}

// A collection of values returned by getDelegateIds.
type GetDelegateIdsResult struct {
	// A list of delegate ID's matching the specified search criteria.
	DelegateIds []string `pulumi:"delegateIds"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The name of the delegate to query for.
	Name *string `pulumi:"name"`
	// The status of the delegate to query for. Valid values are DELETED, ENABLED, WAITING*FOR*APPROVAL
	Status *string `pulumi:"status"`
	// The type of the delegate to query for. Valid values are DOCKER, ECS, HELM*DELEGATE, KUBERNETES, SHELL*SCRIPT
	Type *string `pulumi:"type"`
}

func GetDelegateIdsOutput(ctx *pulumi.Context, args GetDelegateIdsOutputArgs, opts ...pulumi.InvokeOption) GetDelegateIdsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDelegateIdsResult, error) {
			args := v.(GetDelegateIdsArgs)
			r, err := GetDelegateIds(ctx, &args, opts...)
			var s GetDelegateIdsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDelegateIdsResultOutput)
}

// A collection of arguments for invoking getDelegateIds.
type GetDelegateIdsOutputArgs struct {
	// The name of the delegate to query for.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// The status of the delegate to query for. Valid values are DELETED, ENABLED, WAITING*FOR*APPROVAL
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The type of the delegate to query for. Valid values are DOCKER, ECS, HELM*DELEGATE, KUBERNETES, SHELL*SCRIPT
	Type pulumi.StringPtrInput `pulumi:"type"`
}

func (GetDelegateIdsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDelegateIdsArgs)(nil)).Elem()
}

// A collection of values returned by getDelegateIds.
type GetDelegateIdsResultOutput struct{ *pulumi.OutputState }

func (GetDelegateIdsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDelegateIdsResult)(nil)).Elem()
}

func (o GetDelegateIdsResultOutput) ToGetDelegateIdsResultOutput() GetDelegateIdsResultOutput {
	return o
}

func (o GetDelegateIdsResultOutput) ToGetDelegateIdsResultOutputWithContext(ctx context.Context) GetDelegateIdsResultOutput {
	return o
}

// A list of delegate ID's matching the specified search criteria.
func (o GetDelegateIdsResultOutput) DelegateIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDelegateIdsResult) []string { return v.DelegateIds }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDelegateIdsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDelegateIdsResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the delegate to query for.
func (o GetDelegateIdsResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDelegateIdsResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The status of the delegate to query for. Valid values are DELETED, ENABLED, WAITING*FOR*APPROVAL
func (o GetDelegateIdsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDelegateIdsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

// The type of the delegate to query for. Valid values are DOCKER, ECS, HELM*DELEGATE, KUBERNETES, SHELL*SCRIPT
func (o GetDelegateIdsResultOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDelegateIdsResult) *string { return v.Type }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDelegateIdsResultOutput{})
}
