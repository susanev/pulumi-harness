// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.PlatformConnector.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.PlatformConnector.outputs.GetGitCredentialHttp;
import com.pulumi.harness.PlatformConnector.outputs.GetGitCredentialSsh;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGitCredential {
    private List<GetGitCredentialHttp> https;
    private List<GetGitCredentialSsh> sshes;

    private GetGitCredential() {}
    public List<GetGitCredentialHttp> https() {
        return this.https;
    }
    public List<GetGitCredentialSsh> sshes() {
        return this.sshes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitCredential defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetGitCredentialHttp> https;
        private List<GetGitCredentialSsh> sshes;
        public Builder() {}
        public Builder(GetGitCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.https = defaults.https;
    	      this.sshes = defaults.sshes;
        }

        @CustomType.Setter
        public Builder https(List<GetGitCredentialHttp> https) {
            this.https = Objects.requireNonNull(https);
            return this;
        }
        public Builder https(GetGitCredentialHttp... https) {
            return https(List.of(https));
        }
        @CustomType.Setter
        public Builder sshes(List<GetGitCredentialSsh> sshes) {
            this.sshes = Objects.requireNonNull(sshes);
            return this;
        }
        public Builder sshes(GetGitCredentialSsh... sshes) {
            return sshes(List.of(sshes));
        }
        public GetGitCredential build() {
            final var o = new GetGitCredential();
            o.https = https;
            o.sshes = sshes;
            return o;
        }
    }
}
