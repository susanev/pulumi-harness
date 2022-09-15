// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package harness

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The provider type for the harness package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState

	// The Harness account id. This can also be set using the `HARNESS_ACCOUNT_ID` environment variable.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The Harness API key. This can also be set using the `HARNESS_API_KEY` environment variable.
	ApiKey pulumi.StringPtrOutput `pulumi:"apiKey"`
	// The URL of the Harness API endpoint. The default is `https://app.harness.io/gateway`. This can also be set using the
	// `HARNESS_ENDPOINT` environment variable.
	Endpoint pulumi.StringOutput `pulumi:"endpoint"`
	// The API key for the Harness next gen platform. This can also be set using the `HARNESS_PLATFORM_API_KEY` environment
	// variable.
	PlatformApiKey pulumi.StringPtrOutput `pulumi:"platformApiKey"`
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Endpoint == nil {
		return nil, errors.New("invalid value for required argument 'Endpoint'")
	}
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:harness", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	// The Harness account id. This can also be set using the `HARNESS_ACCOUNT_ID` environment variable.
	AccountId string `pulumi:"accountId"`
	// The Harness API key. This can also be set using the `HARNESS_API_KEY` environment variable.
	ApiKey *string `pulumi:"apiKey"`
	// The URL of the Harness API endpoint. The default is `https://app.harness.io/gateway`. This can also be set using the
	// `HARNESS_ENDPOINT` environment variable.
	Endpoint string `pulumi:"endpoint"`
	// The API key for the Harness next gen platform. This can also be set using the `HARNESS_PLATFORM_API_KEY` environment
	// variable.
	PlatformApiKey *string `pulumi:"platformApiKey"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	// The Harness account id. This can also be set using the `HARNESS_ACCOUNT_ID` environment variable.
	AccountId pulumi.StringInput
	// The Harness API key. This can also be set using the `HARNESS_API_KEY` environment variable.
	ApiKey pulumi.StringPtrInput
	// The URL of the Harness API endpoint. The default is `https://app.harness.io/gateway`. This can also be set using the
	// `HARNESS_ENDPOINT` environment variable.
	Endpoint pulumi.StringInput
	// The API key for the Harness next gen platform. This can also be set using the `HARNESS_PLATFORM_API_KEY` environment
	// variable.
	PlatformApiKey pulumi.StringPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

type ProviderOutput struct{ *pulumi.OutputState }

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

// The Harness account id. This can also be set using the `HARNESS_ACCOUNT_ID` environment variable.
func (o ProviderOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The Harness API key. This can also be set using the `HARNESS_API_KEY` environment variable.
func (o ProviderOutput) ApiKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ApiKey }).(pulumi.StringPtrOutput)
}

// The URL of the Harness API endpoint. The default is `https://app.harness.io/gateway`. This can also be set using the
// `HARNESS_ENDPOINT` environment variable.
func (o ProviderOutput) Endpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringOutput { return v.Endpoint }).(pulumi.StringOutput)
}

// The API key for the Harness next gen platform. This can also be set using the `HARNESS_PLATFORM_API_KEY` environment
// variable.
func (o ProviderOutput) PlatformApiKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.PlatformApiKey }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterOutputType(ProviderOutput{})
}
