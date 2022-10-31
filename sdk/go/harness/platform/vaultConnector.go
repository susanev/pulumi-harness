// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating a HashiCorp Vault Secret Manager connector.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/lbrlabs/pulumi-harness/sdk/go/harness/platform"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := platform.NewVaultConnector(ctx, "awsAuth", &platform.VaultConnectorArgs{
//				AccessType: pulumi.String("AWS_IAM"),
//				AwsRegion:  pulumi.String("aws_region"),
//				BasePath:   pulumi.String("base_path"),
//				Default:    pulumi.Bool(false),
//				DelegateSelectors: pulumi.StringArray{
//					pulumi.String("harness-delegate"),
//				},
//				Description:                    pulumi.String("test"),
//				Identifier:                     pulumi.String("identifier"),
//				ReadOnly:                       pulumi.Bool(true),
//				RenewalIntervalMinutes:         pulumi.Int(60),
//				SecretEngineManuallyConfigured: pulumi.Bool(true),
//				SecretEngineName:               pulumi.String("secret_engine_name"),
//				SecretEngineVersion:            pulumi.Int(2),
//				Tags: pulumi.StringArray{
//					pulumi.String("foo:bar"),
//				},
//				UseAwsIam:            pulumi.Bool(true),
//				UseK8sAuth:           pulumi.Bool(false),
//				UseVaultAgent:        pulumi.Bool(false),
//				VaultAwsIamRole:      pulumi.String("vault_aws_iam_role"),
//				VaultUrl:             pulumi.String("https://vault_url.com"),
//				XvaultAwsIamServerId: pulumi.String(fmt.Sprintf("account.%v", harness_platform_secret_text.Test.Id)),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = platform.NewVaultConnector(ctx, "appRole", &platform.VaultConnectorArgs{
//				AccessType: pulumi.String("APP_ROLE"),
//				AppRoleId:  pulumi.String("app_role_id"),
//				BasePath:   pulumi.String("base_path"),
//				Default:    pulumi.Bool(false),
//				DelegateSelectors: pulumi.StringArray{
//					pulumi.String("harness-delegate"),
//				},
//				Description:                    pulumi.String("test"),
//				Identifier:                     pulumi.String("identifier"),
//				ReadOnly:                       pulumi.Bool(true),
//				RenewAppRoleToken:              pulumi.Bool(true),
//				RenewalIntervalMinutes:         pulumi.Int(60),
//				SecretEngineManuallyConfigured: pulumi.Bool(true),
//				SecretEngineName:               pulumi.String("secret_engine_name"),
//				SecretEngineVersion:            pulumi.Int(2),
//				SecretId:                       pulumi.String(fmt.Sprintf("account.%v", harness_platform_secret_text.Test.Id)),
//				Tags: pulumi.StringArray{
//					pulumi.String("foo:bar"),
//				},
//				UseAwsIam:     pulumi.Bool(false),
//				UseK8sAuth:    pulumi.Bool(false),
//				UseVaultAgent: pulumi.Bool(false),
//				VaultUrl:      pulumi.String("https://vault_url.com"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = platform.NewVaultConnector(ctx, "k8sAuth", &platform.VaultConnectorArgs{
//				AccessType: pulumi.String("K8s_AUTH"),
//				AuthToken:  pulumi.String(fmt.Sprintf("account.%v", harness_platform_secret_text.Test.Id)),
//				BasePath:   pulumi.String("base_path"),
//				Default:    pulumi.Bool(false),
//				DelegateSelectors: pulumi.StringArray{
//					pulumi.String("harness-delegate"),
//				},
//				Description:                    pulumi.String("test"),
//				Identifier:                     pulumi.String("identifier"),
//				K8sAuthEndpoint:                pulumi.String("k8s_auth_endpoint"),
//				Namespace:                      pulumi.String("namespace"),
//				ReadOnly:                       pulumi.Bool(true),
//				RenewalIntervalMinutes:         pulumi.Int(10),
//				SecretEngineManuallyConfigured: pulumi.Bool(true),
//				SecretEngineName:               pulumi.String("secret_engine_name"),
//				SecretEngineVersion:            pulumi.Int(2),
//				ServiceAccountTokenPath:        pulumi.String("service_account_token_path"),
//				Tags: pulumi.StringArray{
//					pulumi.String("foo:bar"),
//				},
//				UseAwsIam:        pulumi.Bool(false),
//				UseK8sAuth:       pulumi.Bool(true),
//				UseVaultAgent:    pulumi.Bool(false),
//				VaultAwsIamRole:  pulumi.String("vault_aws_iam_role"),
//				VaultK8sAuthRole: pulumi.String("vault_k8s_auth_role"),
//				VaultUrl:         pulumi.String("https://vault_url.com"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = platform.NewVaultConnector(ctx, "vaultAgent", &platform.VaultConnectorArgs{
//				AccessType: pulumi.String("VAULT_AGENT"),
//				AuthToken:  pulumi.String(fmt.Sprintf("account.%v", harness_platform_secret_text.Test.Id)),
//				BasePath:   pulumi.String("base_path"),
//				Default:    pulumi.Bool(false),
//				DelegateSelectors: pulumi.StringArray{
//					pulumi.String("harness-delegate"),
//				},
//				Description:                    pulumi.String("test"),
//				Identifier:                     pulumi.String("identifier"),
//				Namespace:                      pulumi.String("namespace"),
//				ReadOnly:                       pulumi.Bool(true),
//				RenewalIntervalMinutes:         pulumi.Int(10),
//				SecretEngineManuallyConfigured: pulumi.Bool(true),
//				SecretEngineName:               pulumi.String("secret_engine_name"),
//				SecretEngineVersion:            pulumi.Int(2),
//				SinkPath:                       pulumi.String("sink_path"),
//				Tags: pulumi.StringArray{
//					pulumi.String("foo:bar"),
//				},
//				UseAwsIam:     pulumi.Bool(false),
//				UseK8sAuth:    pulumi.Bool(false),
//				UseVaultAgent: pulumi.Bool(true),
//				VaultUrl:      pulumi.String("https://vault_url.com"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = platform.NewVaultConnector(ctx, "token", &platform.VaultConnectorArgs{
//				AccessType:                     pulumi.String("TOKEN"),
//				AuthToken:                      pulumi.String(fmt.Sprintf("account.%v", harness_platform_secret_text.Test.Id)),
//				BasePath:                       pulumi.String("base_path"),
//				Default:                        pulumi.Bool(false),
//				Description:                    pulumi.String("test"),
//				Identifier:                     pulumi.String("identifier"),
//				Namespace:                      pulumi.String("namespace"),
//				ReadOnly:                       pulumi.Bool(true),
//				RenewalIntervalMinutes:         pulumi.Int(10),
//				SecretEngineManuallyConfigured: pulumi.Bool(true),
//				SecretEngineName:               pulumi.String("secret_engine_name"),
//				SecretEngineVersion:            pulumi.Int(2),
//				Tags: pulumi.StringArray{
//					pulumi.String("foo:bar"),
//				},
//				UseAwsIam:  pulumi.Bool(false),
//				UseK8sAuth: pulumi.Bool(false),
//				VaultUrl:   pulumi.String("https://vault_url.com"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// # Import using vault connector id
//
// ```sh
//
//	$ pulumi import harness:platform/vaultConnector:VaultConnector example <connector_id>
//
// ```
type VaultConnector struct {
	pulumi.CustomResourceState

	// Access type.
	AccessType pulumi.StringPtrOutput `pulumi:"accessType"`
	// ID of App Role.
	AppRoleId pulumi.StringPtrOutput `pulumi:"appRoleId"`
	// Authentication token for Vault.
	AuthToken pulumi.StringOutput `pulumi:"authToken"`
	// AWS region where the AWS IAM authentication will happen.
	AwsRegion pulumi.StringPtrOutput `pulumi:"awsRegion"`
	// Location of the Vault directory where the secret will be stored.
	BasePath pulumi.StringPtrOutput `pulumi:"basePath"`
	// Is default or not.
	Default pulumi.BoolPtrOutput `pulumi:"default"`
	// List of Delegate Selectors that belong to the same Delegate and are used to connect to the Secret Manager.
	DelegateSelectors pulumi.StringArrayOutput `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Is default or not.
	IsDefault pulumi.BoolPtrOutput `pulumi:"isDefault"`
	// Read only or not.
	IsReadOnly pulumi.BoolPtrOutput `pulumi:"isReadOnly"`
	// The path where Kubernetes Auth is enabled in Vault.
	K8sAuthEndpoint pulumi.StringPtrOutput `pulumi:"k8sAuthEndpoint"`
	// Name of the resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// Vault namespace where the Secret will be created.
	Namespace pulumi.StringPtrOutput `pulumi:"namespace"`
	// Unique identifier of the Organization.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// Unique identifier of the Project.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Read only.
	ReadOnly pulumi.BoolPtrOutput `pulumi:"readOnly"`
	// Boolean value to indicate if AppRole token renewal is enabled or not.
	RenewAppRoleToken pulumi.BoolPtrOutput `pulumi:"renewAppRoleToken"`
	// The time interval for the token renewal.
	RenewalIntervalMinutes pulumi.IntOutput `pulumi:"renewalIntervalMinutes"`
	// Manually entered Secret Engine.
	SecretEngineManuallyConfigured pulumi.BoolPtrOutput `pulumi:"secretEngineManuallyConfigured"`
	// Name of the Secret Engine.
	SecretEngineName pulumi.StringPtrOutput `pulumi:"secretEngineName"`
	// Version of Secret Engine.
	SecretEngineVersion pulumi.IntPtrOutput `pulumi:"secretEngineVersion"`
	// ID of the Secret.
	SecretId pulumi.StringPtrOutput `pulumi:"secretId"`
	// The Service Account token path in the K8s pod where the token is mounted.
	ServiceAccountTokenPath pulumi.StringPtrOutput `pulumi:"serviceAccountTokenPath"`
	// The location from which the authentication token should be read.
	SinkPath pulumi.StringPtrOutput `pulumi:"sinkPath"`
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// Boolean value to indicate if AWS IAM is used for authentication.
	UseAwsIam pulumi.BoolPtrOutput `pulumi:"useAwsIam"`
	// Boolean value to indicate if K8s Auth is used for authentication.
	UseK8sAuth pulumi.BoolPtrOutput `pulumi:"useK8sAuth"`
	// Boolean value to indicate if Vault Agent is used for authentication.
	UseVaultAgent pulumi.BoolPtrOutput `pulumi:"useVaultAgent"`
	// The Vault role defined to bind to aws iam account/role being accessed.
	VaultAwsIamRole pulumi.StringPtrOutput `pulumi:"vaultAwsIamRole"`
	// The role where K8s Auth will happen.
	VaultK8sAuthRole pulumi.StringPtrOutput `pulumi:"vaultK8sAuthRole"`
	// URL of the HashiCorp Vault.
	VaultUrl pulumi.StringOutput `pulumi:"vaultUrl"`
	// The AWS IAM Header Server ID that has been configured for this AWS IAM instance.
	XvaultAwsIamServerId pulumi.StringPtrOutput `pulumi:"xvaultAwsIamServerId"`
}

// NewVaultConnector registers a new resource with the given unique name, arguments, and options.
func NewVaultConnector(ctx *pulumi.Context,
	name string, args *VaultConnectorArgs, opts ...pulumi.ResourceOption) (*VaultConnector, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.RenewalIntervalMinutes == nil {
		return nil, errors.New("invalid value for required argument 'RenewalIntervalMinutes'")
	}
	if args.VaultUrl == nil {
		return nil, errors.New("invalid value for required argument 'VaultUrl'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource VaultConnector
	err := ctx.RegisterResource("harness:platform/vaultConnector:VaultConnector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVaultConnector gets an existing VaultConnector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVaultConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VaultConnectorState, opts ...pulumi.ResourceOption) (*VaultConnector, error) {
	var resource VaultConnector
	err := ctx.ReadResource("harness:platform/vaultConnector:VaultConnector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VaultConnector resources.
type vaultConnectorState struct {
	// Access type.
	AccessType *string `pulumi:"accessType"`
	// ID of App Role.
	AppRoleId *string `pulumi:"appRoleId"`
	// Authentication token for Vault.
	AuthToken *string `pulumi:"authToken"`
	// AWS region where the AWS IAM authentication will happen.
	AwsRegion *string `pulumi:"awsRegion"`
	// Location of the Vault directory where the secret will be stored.
	BasePath *string `pulumi:"basePath"`
	// Is default or not.
	Default *bool `pulumi:"default"`
	// List of Delegate Selectors that belong to the same Delegate and are used to connect to the Secret Manager.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Is default or not.
	IsDefault *bool `pulumi:"isDefault"`
	// Read only or not.
	IsReadOnly *bool `pulumi:"isReadOnly"`
	// The path where Kubernetes Auth is enabled in Vault.
	K8sAuthEndpoint *string `pulumi:"k8sAuthEndpoint"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Vault namespace where the Secret will be created.
	Namespace *string `pulumi:"namespace"`
	// Unique identifier of the Organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the Project.
	ProjectId *string `pulumi:"projectId"`
	// Read only.
	ReadOnly *bool `pulumi:"readOnly"`
	// Boolean value to indicate if AppRole token renewal is enabled or not.
	RenewAppRoleToken *bool `pulumi:"renewAppRoleToken"`
	// The time interval for the token renewal.
	RenewalIntervalMinutes *int `pulumi:"renewalIntervalMinutes"`
	// Manually entered Secret Engine.
	SecretEngineManuallyConfigured *bool `pulumi:"secretEngineManuallyConfigured"`
	// Name of the Secret Engine.
	SecretEngineName *string `pulumi:"secretEngineName"`
	// Version of Secret Engine.
	SecretEngineVersion *int `pulumi:"secretEngineVersion"`
	// ID of the Secret.
	SecretId *string `pulumi:"secretId"`
	// The Service Account token path in the K8s pod where the token is mounted.
	ServiceAccountTokenPath *string `pulumi:"serviceAccountTokenPath"`
	// The location from which the authentication token should be read.
	SinkPath *string `pulumi:"sinkPath"`
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags []string `pulumi:"tags"`
	// Boolean value to indicate if AWS IAM is used for authentication.
	UseAwsIam *bool `pulumi:"useAwsIam"`
	// Boolean value to indicate if K8s Auth is used for authentication.
	UseK8sAuth *bool `pulumi:"useK8sAuth"`
	// Boolean value to indicate if Vault Agent is used for authentication.
	UseVaultAgent *bool `pulumi:"useVaultAgent"`
	// The Vault role defined to bind to aws iam account/role being accessed.
	VaultAwsIamRole *string `pulumi:"vaultAwsIamRole"`
	// The role where K8s Auth will happen.
	VaultK8sAuthRole *string `pulumi:"vaultK8sAuthRole"`
	// URL of the HashiCorp Vault.
	VaultUrl *string `pulumi:"vaultUrl"`
	// The AWS IAM Header Server ID that has been configured for this AWS IAM instance.
	XvaultAwsIamServerId *string `pulumi:"xvaultAwsIamServerId"`
}

type VaultConnectorState struct {
	// Access type.
	AccessType pulumi.StringPtrInput
	// ID of App Role.
	AppRoleId pulumi.StringPtrInput
	// Authentication token for Vault.
	AuthToken pulumi.StringPtrInput
	// AWS region where the AWS IAM authentication will happen.
	AwsRegion pulumi.StringPtrInput
	// Location of the Vault directory where the secret will be stored.
	BasePath pulumi.StringPtrInput
	// Is default or not.
	Default pulumi.BoolPtrInput
	// List of Delegate Selectors that belong to the same Delegate and are used to connect to the Secret Manager.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput
	// Is default or not.
	IsDefault pulumi.BoolPtrInput
	// Read only or not.
	IsReadOnly pulumi.BoolPtrInput
	// The path where Kubernetes Auth is enabled in Vault.
	K8sAuthEndpoint pulumi.StringPtrInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Vault namespace where the Secret will be created.
	Namespace pulumi.StringPtrInput
	// Unique identifier of the Organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the Project.
	ProjectId pulumi.StringPtrInput
	// Read only.
	ReadOnly pulumi.BoolPtrInput
	// Boolean value to indicate if AppRole token renewal is enabled or not.
	RenewAppRoleToken pulumi.BoolPtrInput
	// The time interval for the token renewal.
	RenewalIntervalMinutes pulumi.IntPtrInput
	// Manually entered Secret Engine.
	SecretEngineManuallyConfigured pulumi.BoolPtrInput
	// Name of the Secret Engine.
	SecretEngineName pulumi.StringPtrInput
	// Version of Secret Engine.
	SecretEngineVersion pulumi.IntPtrInput
	// ID of the Secret.
	SecretId pulumi.StringPtrInput
	// The Service Account token path in the K8s pod where the token is mounted.
	ServiceAccountTokenPath pulumi.StringPtrInput
	// The location from which the authentication token should be read.
	SinkPath pulumi.StringPtrInput
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags pulumi.StringArrayInput
	// Boolean value to indicate if AWS IAM is used for authentication.
	UseAwsIam pulumi.BoolPtrInput
	// Boolean value to indicate if K8s Auth is used for authentication.
	UseK8sAuth pulumi.BoolPtrInput
	// Boolean value to indicate if Vault Agent is used for authentication.
	UseVaultAgent pulumi.BoolPtrInput
	// The Vault role defined to bind to aws iam account/role being accessed.
	VaultAwsIamRole pulumi.StringPtrInput
	// The role where K8s Auth will happen.
	VaultK8sAuthRole pulumi.StringPtrInput
	// URL of the HashiCorp Vault.
	VaultUrl pulumi.StringPtrInput
	// The AWS IAM Header Server ID that has been configured for this AWS IAM instance.
	XvaultAwsIamServerId pulumi.StringPtrInput
}

func (VaultConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*vaultConnectorState)(nil)).Elem()
}

type vaultConnectorArgs struct {
	// Access type.
	AccessType *string `pulumi:"accessType"`
	// ID of App Role.
	AppRoleId *string `pulumi:"appRoleId"`
	// Authentication token for Vault.
	AuthToken *string `pulumi:"authToken"`
	// AWS region where the AWS IAM authentication will happen.
	AwsRegion *string `pulumi:"awsRegion"`
	// Location of the Vault directory where the secret will be stored.
	BasePath *string `pulumi:"basePath"`
	// Is default or not.
	Default *bool `pulumi:"default"`
	// List of Delegate Selectors that belong to the same Delegate and are used to connect to the Secret Manager.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Is default or not.
	IsDefault *bool `pulumi:"isDefault"`
	// Read only or not.
	IsReadOnly *bool `pulumi:"isReadOnly"`
	// The path where Kubernetes Auth is enabled in Vault.
	K8sAuthEndpoint *string `pulumi:"k8sAuthEndpoint"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Vault namespace where the Secret will be created.
	Namespace *string `pulumi:"namespace"`
	// Unique identifier of the Organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the Project.
	ProjectId *string `pulumi:"projectId"`
	// Read only.
	ReadOnly *bool `pulumi:"readOnly"`
	// Boolean value to indicate if AppRole token renewal is enabled or not.
	RenewAppRoleToken *bool `pulumi:"renewAppRoleToken"`
	// The time interval for the token renewal.
	RenewalIntervalMinutes int `pulumi:"renewalIntervalMinutes"`
	// Manually entered Secret Engine.
	SecretEngineManuallyConfigured *bool `pulumi:"secretEngineManuallyConfigured"`
	// Name of the Secret Engine.
	SecretEngineName *string `pulumi:"secretEngineName"`
	// Version of Secret Engine.
	SecretEngineVersion *int `pulumi:"secretEngineVersion"`
	// ID of the Secret.
	SecretId *string `pulumi:"secretId"`
	// The Service Account token path in the K8s pod where the token is mounted.
	ServiceAccountTokenPath *string `pulumi:"serviceAccountTokenPath"`
	// The location from which the authentication token should be read.
	SinkPath *string `pulumi:"sinkPath"`
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags []string `pulumi:"tags"`
	// Boolean value to indicate if AWS IAM is used for authentication.
	UseAwsIam *bool `pulumi:"useAwsIam"`
	// Boolean value to indicate if K8s Auth is used for authentication.
	UseK8sAuth *bool `pulumi:"useK8sAuth"`
	// Boolean value to indicate if Vault Agent is used for authentication.
	UseVaultAgent *bool `pulumi:"useVaultAgent"`
	// The Vault role defined to bind to aws iam account/role being accessed.
	VaultAwsIamRole *string `pulumi:"vaultAwsIamRole"`
	// The role where K8s Auth will happen.
	VaultK8sAuthRole *string `pulumi:"vaultK8sAuthRole"`
	// URL of the HashiCorp Vault.
	VaultUrl string `pulumi:"vaultUrl"`
	// The AWS IAM Header Server ID that has been configured for this AWS IAM instance.
	XvaultAwsIamServerId *string `pulumi:"xvaultAwsIamServerId"`
}

// The set of arguments for constructing a VaultConnector resource.
type VaultConnectorArgs struct {
	// Access type.
	AccessType pulumi.StringPtrInput
	// ID of App Role.
	AppRoleId pulumi.StringPtrInput
	// Authentication token for Vault.
	AuthToken pulumi.StringPtrInput
	// AWS region where the AWS IAM authentication will happen.
	AwsRegion pulumi.StringPtrInput
	// Location of the Vault directory where the secret will be stored.
	BasePath pulumi.StringPtrInput
	// Is default or not.
	Default pulumi.BoolPtrInput
	// List of Delegate Selectors that belong to the same Delegate and are used to connect to the Secret Manager.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringInput
	// Is default or not.
	IsDefault pulumi.BoolPtrInput
	// Read only or not.
	IsReadOnly pulumi.BoolPtrInput
	// The path where Kubernetes Auth is enabled in Vault.
	K8sAuthEndpoint pulumi.StringPtrInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Vault namespace where the Secret will be created.
	Namespace pulumi.StringPtrInput
	// Unique identifier of the Organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the Project.
	ProjectId pulumi.StringPtrInput
	// Read only.
	ReadOnly pulumi.BoolPtrInput
	// Boolean value to indicate if AppRole token renewal is enabled or not.
	RenewAppRoleToken pulumi.BoolPtrInput
	// The time interval for the token renewal.
	RenewalIntervalMinutes pulumi.IntInput
	// Manually entered Secret Engine.
	SecretEngineManuallyConfigured pulumi.BoolPtrInput
	// Name of the Secret Engine.
	SecretEngineName pulumi.StringPtrInput
	// Version of Secret Engine.
	SecretEngineVersion pulumi.IntPtrInput
	// ID of the Secret.
	SecretId pulumi.StringPtrInput
	// The Service Account token path in the K8s pod where the token is mounted.
	ServiceAccountTokenPath pulumi.StringPtrInput
	// The location from which the authentication token should be read.
	SinkPath pulumi.StringPtrInput
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags pulumi.StringArrayInput
	// Boolean value to indicate if AWS IAM is used for authentication.
	UseAwsIam pulumi.BoolPtrInput
	// Boolean value to indicate if K8s Auth is used for authentication.
	UseK8sAuth pulumi.BoolPtrInput
	// Boolean value to indicate if Vault Agent is used for authentication.
	UseVaultAgent pulumi.BoolPtrInput
	// The Vault role defined to bind to aws iam account/role being accessed.
	VaultAwsIamRole pulumi.StringPtrInput
	// The role where K8s Auth will happen.
	VaultK8sAuthRole pulumi.StringPtrInput
	// URL of the HashiCorp Vault.
	VaultUrl pulumi.StringInput
	// The AWS IAM Header Server ID that has been configured for this AWS IAM instance.
	XvaultAwsIamServerId pulumi.StringPtrInput
}

func (VaultConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*vaultConnectorArgs)(nil)).Elem()
}

type VaultConnectorInput interface {
	pulumi.Input

	ToVaultConnectorOutput() VaultConnectorOutput
	ToVaultConnectorOutputWithContext(ctx context.Context) VaultConnectorOutput
}

func (*VaultConnector) ElementType() reflect.Type {
	return reflect.TypeOf((**VaultConnector)(nil)).Elem()
}

func (i *VaultConnector) ToVaultConnectorOutput() VaultConnectorOutput {
	return i.ToVaultConnectorOutputWithContext(context.Background())
}

func (i *VaultConnector) ToVaultConnectorOutputWithContext(ctx context.Context) VaultConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VaultConnectorOutput)
}

// VaultConnectorArrayInput is an input type that accepts VaultConnectorArray and VaultConnectorArrayOutput values.
// You can construct a concrete instance of `VaultConnectorArrayInput` via:
//
//	VaultConnectorArray{ VaultConnectorArgs{...} }
type VaultConnectorArrayInput interface {
	pulumi.Input

	ToVaultConnectorArrayOutput() VaultConnectorArrayOutput
	ToVaultConnectorArrayOutputWithContext(context.Context) VaultConnectorArrayOutput
}

type VaultConnectorArray []VaultConnectorInput

func (VaultConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VaultConnector)(nil)).Elem()
}

func (i VaultConnectorArray) ToVaultConnectorArrayOutput() VaultConnectorArrayOutput {
	return i.ToVaultConnectorArrayOutputWithContext(context.Background())
}

func (i VaultConnectorArray) ToVaultConnectorArrayOutputWithContext(ctx context.Context) VaultConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VaultConnectorArrayOutput)
}

// VaultConnectorMapInput is an input type that accepts VaultConnectorMap and VaultConnectorMapOutput values.
// You can construct a concrete instance of `VaultConnectorMapInput` via:
//
//	VaultConnectorMap{ "key": VaultConnectorArgs{...} }
type VaultConnectorMapInput interface {
	pulumi.Input

	ToVaultConnectorMapOutput() VaultConnectorMapOutput
	ToVaultConnectorMapOutputWithContext(context.Context) VaultConnectorMapOutput
}

type VaultConnectorMap map[string]VaultConnectorInput

func (VaultConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VaultConnector)(nil)).Elem()
}

func (i VaultConnectorMap) ToVaultConnectorMapOutput() VaultConnectorMapOutput {
	return i.ToVaultConnectorMapOutputWithContext(context.Background())
}

func (i VaultConnectorMap) ToVaultConnectorMapOutputWithContext(ctx context.Context) VaultConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VaultConnectorMapOutput)
}

type VaultConnectorOutput struct{ *pulumi.OutputState }

func (VaultConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VaultConnector)(nil)).Elem()
}

func (o VaultConnectorOutput) ToVaultConnectorOutput() VaultConnectorOutput {
	return o
}

func (o VaultConnectorOutput) ToVaultConnectorOutputWithContext(ctx context.Context) VaultConnectorOutput {
	return o
}

// Access type.
func (o VaultConnectorOutput) AccessType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.StringPtrOutput { return v.AccessType }).(pulumi.StringPtrOutput)
}

// ID of App Role.
func (o VaultConnectorOutput) AppRoleId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.StringPtrOutput { return v.AppRoleId }).(pulumi.StringPtrOutput)
}

// Authentication token for Vault.
func (o VaultConnectorOutput) AuthToken() pulumi.StringOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.StringOutput { return v.AuthToken }).(pulumi.StringOutput)
}

// AWS region where the AWS IAM authentication will happen.
func (o VaultConnectorOutput) AwsRegion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.StringPtrOutput { return v.AwsRegion }).(pulumi.StringPtrOutput)
}

// Location of the Vault directory where the secret will be stored.
func (o VaultConnectorOutput) BasePath() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.StringPtrOutput { return v.BasePath }).(pulumi.StringPtrOutput)
}

// Is default or not.
func (o VaultConnectorOutput) Default() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.BoolPtrOutput { return v.Default }).(pulumi.BoolPtrOutput)
}

// List of Delegate Selectors that belong to the same Delegate and are used to connect to the Secret Manager.
func (o VaultConnectorOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.StringArrayOutput { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o VaultConnectorOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Unique identifier of the resource.
func (o VaultConnectorOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Is default or not.
func (o VaultConnectorOutput) IsDefault() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.BoolPtrOutput { return v.IsDefault }).(pulumi.BoolPtrOutput)
}

// Read only or not.
func (o VaultConnectorOutput) IsReadOnly() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.BoolPtrOutput { return v.IsReadOnly }).(pulumi.BoolPtrOutput)
}

// The path where Kubernetes Auth is enabled in Vault.
func (o VaultConnectorOutput) K8sAuthEndpoint() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.StringPtrOutput { return v.K8sAuthEndpoint }).(pulumi.StringPtrOutput)
}

// Name of the resource.
func (o VaultConnectorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Vault namespace where the Secret will be created.
func (o VaultConnectorOutput) Namespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.StringPtrOutput { return v.Namespace }).(pulumi.StringPtrOutput)
}

// Unique identifier of the Organization.
func (o VaultConnectorOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the Project.
func (o VaultConnectorOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Read only.
func (o VaultConnectorOutput) ReadOnly() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.BoolPtrOutput { return v.ReadOnly }).(pulumi.BoolPtrOutput)
}

// Boolean value to indicate if AppRole token renewal is enabled or not.
func (o VaultConnectorOutput) RenewAppRoleToken() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.BoolPtrOutput { return v.RenewAppRoleToken }).(pulumi.BoolPtrOutput)
}

// The time interval for the token renewal.
func (o VaultConnectorOutput) RenewalIntervalMinutes() pulumi.IntOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.IntOutput { return v.RenewalIntervalMinutes }).(pulumi.IntOutput)
}

// Manually entered Secret Engine.
func (o VaultConnectorOutput) SecretEngineManuallyConfigured() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.BoolPtrOutput { return v.SecretEngineManuallyConfigured }).(pulumi.BoolPtrOutput)
}

// Name of the Secret Engine.
func (o VaultConnectorOutput) SecretEngineName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.StringPtrOutput { return v.SecretEngineName }).(pulumi.StringPtrOutput)
}

// Version of Secret Engine.
func (o VaultConnectorOutput) SecretEngineVersion() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.IntPtrOutput { return v.SecretEngineVersion }).(pulumi.IntPtrOutput)
}

// ID of the Secret.
func (o VaultConnectorOutput) SecretId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.StringPtrOutput { return v.SecretId }).(pulumi.StringPtrOutput)
}

// The Service Account token path in the K8s pod where the token is mounted.
func (o VaultConnectorOutput) ServiceAccountTokenPath() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.StringPtrOutput { return v.ServiceAccountTokenPath }).(pulumi.StringPtrOutput)
}

// The location from which the authentication token should be read.
func (o VaultConnectorOutput) SinkPath() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.StringPtrOutput { return v.SinkPath }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource. Tags should be in the form `name:value`.
func (o VaultConnectorOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// Boolean value to indicate if AWS IAM is used for authentication.
func (o VaultConnectorOutput) UseAwsIam() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.BoolPtrOutput { return v.UseAwsIam }).(pulumi.BoolPtrOutput)
}

// Boolean value to indicate if K8s Auth is used for authentication.
func (o VaultConnectorOutput) UseK8sAuth() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.BoolPtrOutput { return v.UseK8sAuth }).(pulumi.BoolPtrOutput)
}

// Boolean value to indicate if Vault Agent is used for authentication.
func (o VaultConnectorOutput) UseVaultAgent() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.BoolPtrOutput { return v.UseVaultAgent }).(pulumi.BoolPtrOutput)
}

// The Vault role defined to bind to aws iam account/role being accessed.
func (o VaultConnectorOutput) VaultAwsIamRole() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.StringPtrOutput { return v.VaultAwsIamRole }).(pulumi.StringPtrOutput)
}

// The role where K8s Auth will happen.
func (o VaultConnectorOutput) VaultK8sAuthRole() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.StringPtrOutput { return v.VaultK8sAuthRole }).(pulumi.StringPtrOutput)
}

// URL of the HashiCorp Vault.
func (o VaultConnectorOutput) VaultUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.StringOutput { return v.VaultUrl }).(pulumi.StringOutput)
}

// The AWS IAM Header Server ID that has been configured for this AWS IAM instance.
func (o VaultConnectorOutput) XvaultAwsIamServerId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VaultConnector) pulumi.StringPtrOutput { return v.XvaultAwsIamServerId }).(pulumi.StringPtrOutput)
}

type VaultConnectorArrayOutput struct{ *pulumi.OutputState }

func (VaultConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VaultConnector)(nil)).Elem()
}

func (o VaultConnectorArrayOutput) ToVaultConnectorArrayOutput() VaultConnectorArrayOutput {
	return o
}

func (o VaultConnectorArrayOutput) ToVaultConnectorArrayOutputWithContext(ctx context.Context) VaultConnectorArrayOutput {
	return o
}

func (o VaultConnectorArrayOutput) Index(i pulumi.IntInput) VaultConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VaultConnector {
		return vs[0].([]*VaultConnector)[vs[1].(int)]
	}).(VaultConnectorOutput)
}

type VaultConnectorMapOutput struct{ *pulumi.OutputState }

func (VaultConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VaultConnector)(nil)).Elem()
}

func (o VaultConnectorMapOutput) ToVaultConnectorMapOutput() VaultConnectorMapOutput {
	return o
}

func (o VaultConnectorMapOutput) ToVaultConnectorMapOutputWithContext(ctx context.Context) VaultConnectorMapOutput {
	return o
}

func (o VaultConnectorMapOutput) MapIndex(k pulumi.StringInput) VaultConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VaultConnector {
		return vs[0].(map[string]*VaultConnector)[vs[1].(string)]
	}).(VaultConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VaultConnectorInput)(nil)).Elem(), &VaultConnector{})
	pulumi.RegisterInputType(reflect.TypeOf((*VaultConnectorArrayInput)(nil)).Elem(), VaultConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VaultConnectorMapInput)(nil)).Elem(), VaultConnectorMap{})
	pulumi.RegisterOutputType(VaultConnectorOutput{})
	pulumi.RegisterOutputType(VaultConnectorArrayOutput{})
	pulumi.RegisterOutputType(VaultConnectorMapOutput{})
}
