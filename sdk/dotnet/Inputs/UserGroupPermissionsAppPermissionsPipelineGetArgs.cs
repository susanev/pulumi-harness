// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Inputs
{

    public sealed class UserGroupPermissionsAppPermissionsPipelineGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("actions", required: true)]
        private InputList<string>? _actions;
        public InputList<string> Actions
        {
            get => _actions ?? (_actions = new InputList<string>());
            set => _actions = value;
        }

        [Input("appIds")]
        private InputList<string>? _appIds;
        public InputList<string> AppIds
        {
            get => _appIds ?? (_appIds = new InputList<string>());
            set => _appIds = value;
        }

        [Input("envIds")]
        private InputList<string>? _envIds;
        public InputList<string> EnvIds
        {
            get => _envIds ?? (_envIds = new InputList<string>());
            set => _envIds = value;
        }

        [Input("filters", required: true)]
        private InputList<string>? _filters;
        public InputList<string> Filters
        {
            get => _filters ?? (_filters = new InputList<string>());
            set => _filters = value;
        }

        public UserGroupPermissionsAppPermissionsPipelineGetArgs()
        {
        }
        public static new UserGroupPermissionsAppPermissionsPipelineGetArgs Empty => new UserGroupPermissionsAppPermissionsPipelineGetArgs();
    }
}
