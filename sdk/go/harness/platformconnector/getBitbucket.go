// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platformconnector

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Datasource for looking up a Bitbucket connector.
func LookupBitbucket(ctx *pulumi.Context, args *LookupBitbucketArgs, opts ...pulumi.InvokeOption) (*LookupBitbucketResult, error) {
	var rv LookupBitbucketResult
	err := ctx.Invoke("harness:PlatformConnector/getBitbucket:getBitbucket", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBitbucket.
type LookupBitbucketArgs struct {
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getBitbucket.
type LookupBitbucketResult struct {
	// Configuration for using the BitBucket api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
	ApiAuthentications []GetBitbucketApiAuthentication `pulumi:"apiAuthentications"`
	// Whether the connection we're making is to a BitBucket repository or a BitBucket account. Valid values are Account, Repo.
	ConnectionType string `pulumi:"connectionType"`
	// Credentials to use for the connection.
	Credentials []GetBitbucketCredential `pulumi:"credentials"`
	// Connect using only the delegates which have these tags.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags []string `pulumi:"tags"`
	// Url of the BitBucket repository or account.
	Url string `pulumi:"url"`
	// Repository to test the connection with. This is only used when `connectionType` is `Account`.
	ValidationRepo string `pulumi:"validationRepo"`
}

func LookupBitbucketOutput(ctx *pulumi.Context, args LookupBitbucketOutputArgs, opts ...pulumi.InvokeOption) LookupBitbucketResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupBitbucketResult, error) {
			args := v.(LookupBitbucketArgs)
			r, err := LookupBitbucket(ctx, &args, opts...)
			var s LookupBitbucketResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupBitbucketResultOutput)
}

// A collection of arguments for invoking getBitbucket.
type LookupBitbucketOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupBitbucketOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBitbucketArgs)(nil)).Elem()
}

// A collection of values returned by getBitbucket.
type LookupBitbucketResultOutput struct{ *pulumi.OutputState }

func (LookupBitbucketResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBitbucketResult)(nil)).Elem()
}

func (o LookupBitbucketResultOutput) ToLookupBitbucketResultOutput() LookupBitbucketResultOutput {
	return o
}

func (o LookupBitbucketResultOutput) ToLookupBitbucketResultOutputWithContext(ctx context.Context) LookupBitbucketResultOutput {
	return o
}

// Configuration for using the BitBucket api. API Access is required for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
func (o LookupBitbucketResultOutput) ApiAuthentications() GetBitbucketApiAuthenticationArrayOutput {
	return o.ApplyT(func(v LookupBitbucketResult) []GetBitbucketApiAuthentication { return v.ApiAuthentications }).(GetBitbucketApiAuthenticationArrayOutput)
}

// Whether the connection we're making is to a BitBucket repository or a BitBucket account. Valid values are Account, Repo.
func (o LookupBitbucketResultOutput) ConnectionType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBitbucketResult) string { return v.ConnectionType }).(pulumi.StringOutput)
}

// Credentials to use for the connection.
func (o LookupBitbucketResultOutput) Credentials() GetBitbucketCredentialArrayOutput {
	return o.ApplyT(func(v LookupBitbucketResult) []GetBitbucketCredential { return v.Credentials }).(GetBitbucketCredentialArrayOutput)
}

// Connect using only the delegates which have these tags.
func (o LookupBitbucketResultOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupBitbucketResult) []string { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o LookupBitbucketResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBitbucketResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupBitbucketResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBitbucketResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupBitbucketResultOutput) Identifier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupBitbucketResult) *string { return v.Identifier }).(pulumi.StringPtrOutput)
}

// Name of the resource.
func (o LookupBitbucketResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupBitbucketResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupBitbucketResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupBitbucketResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupBitbucketResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupBitbucketResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource. Tags should be in the form `name:value`.
func (o LookupBitbucketResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupBitbucketResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// Url of the BitBucket repository or account.
func (o LookupBitbucketResultOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBitbucketResult) string { return v.Url }).(pulumi.StringOutput)
}

// Repository to test the connection with. This is only used when `connectionType` is `Account`.
func (o LookupBitbucketResultOutput) ValidationRepo() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBitbucketResult) string { return v.ValidationRepo }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupBitbucketResultOutput{})
}
