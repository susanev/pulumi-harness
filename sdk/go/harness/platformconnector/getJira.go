// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platformconnector

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Datasource for looking up a Jira connector.
func LookupJira(ctx *pulumi.Context, args *LookupJiraArgs, opts ...pulumi.InvokeOption) (*LookupJiraResult, error) {
	var rv LookupJiraResult
	err := ctx.Invoke("harness:PlatformConnector/getJira:getJira", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getJira.
type LookupJiraArgs struct {
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getJira.
type LookupJiraResult struct {
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
	// Reference to a secret containing the password to use for authentication.
	PasswordRef string `pulumi:"passwordRef"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags []string `pulumi:"tags"`
	// Url of the Jira server.
	Url string `pulumi:"url"`
	// Username to use for authentication.
	Username string `pulumi:"username"`
	// Reference to a secret containing the username to use for authentication.
	UsernameRef string `pulumi:"usernameRef"`
}

func LookupJiraOutput(ctx *pulumi.Context, args LookupJiraOutputArgs, opts ...pulumi.InvokeOption) LookupJiraResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupJiraResult, error) {
			args := v.(LookupJiraArgs)
			r, err := LookupJira(ctx, &args, opts...)
			var s LookupJiraResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupJiraResultOutput)
}

// A collection of arguments for invoking getJira.
type LookupJiraOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupJiraOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupJiraArgs)(nil)).Elem()
}

// A collection of values returned by getJira.
type LookupJiraResultOutput struct{ *pulumi.OutputState }

func (LookupJiraResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupJiraResult)(nil)).Elem()
}

func (o LookupJiraResultOutput) ToLookupJiraResultOutput() LookupJiraResultOutput {
	return o
}

func (o LookupJiraResultOutput) ToLookupJiraResultOutputWithContext(ctx context.Context) LookupJiraResultOutput {
	return o
}

// Connect using only the delegates which have these tags.
func (o LookupJiraResultOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupJiraResult) []string { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o LookupJiraResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupJiraResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupJiraResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupJiraResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupJiraResultOutput) Identifier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupJiraResult) *string { return v.Identifier }).(pulumi.StringPtrOutput)
}

// Name of the resource.
func (o LookupJiraResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupJiraResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupJiraResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupJiraResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Reference to a secret containing the password to use for authentication.
func (o LookupJiraResultOutput) PasswordRef() pulumi.StringOutput {
	return o.ApplyT(func(v LookupJiraResult) string { return v.PasswordRef }).(pulumi.StringOutput)
}

// Unique identifier of the project.
func (o LookupJiraResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupJiraResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource. Tags should be in the form `name:value`.
func (o LookupJiraResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupJiraResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// Url of the Jira server.
func (o LookupJiraResultOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v LookupJiraResult) string { return v.Url }).(pulumi.StringOutput)
}

// Username to use for authentication.
func (o LookupJiraResultOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v LookupJiraResult) string { return v.Username }).(pulumi.StringOutput)
}

// Reference to a secret containing the username to use for authentication.
func (o LookupJiraResultOutput) UsernameRef() pulumi.StringOutput {
	return o.ApplyT(func(v LookupJiraResult) string { return v.UsernameRef }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupJiraResultOutput{})
}
