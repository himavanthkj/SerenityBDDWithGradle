#!/usr/bin/groovy
library identifier: "<library_name>"
	retreiver: modernSCM([
		$class: 'GitSCMSOURCE'
		remote: '<librabry_github_repo_url>'
	])
def git_credentials_id = '<git_hub_credentails_saved_in_jenkins>'
def gitURL= '<git_repo_url_which_we_want_to_build>'

//Define Vault Objects
def VaultUrl = '<vaultServerUrl>'
def vaultRoleId = '<vault_role_id>'
def vaultsecrests = [
	[
		$class: 'VaultSecret', path: '<path of the vault credentails whic we are looking for>', secretvalue: [
			[$class: 'VaultSecreValue', envVar: 'nexus_Username', vaultKey: 'vaultUserName']
		]
	],
	[
		$class: 'VaultSecret', path: '<path of the vault credentails whic we are looking for>', secretvalue: [
			[$class: 'VaultSecreValue', envVar: 'nexus_AUTHKEY', vaultKey: 'nexusPassword']
		]		
	]
]
def vaultConfig = [
		$class	: 	'<method_name>',
		vaultSecrets :  vaultSecrets,
		roleId	:	vaultRoleId,
		vaulrUrl  :	 OurvaultUrl,
		exposeAuthToken	:	false,
		wrap	:	true
]

pipeline{
	agent{label '<agent_name>'}
	
	stages{
	
	stage('checkout-Git'){
			steps{
				script{
					try{
					gitCheckout(gitUrl,params.branch,git_credentials_id)
					}catch(Exception e){
						echo "Caught Error: ${e}"
						sh "exit 1"
					}
				}
			}
	}
	
	}

	}
    post {
          failure {
                // One or more steps need to be included within each condition's block.
                step([$class: '<var name>'])
            }
        always {
			script{
				echo currentBuild.displayname = "${BUILD_NUMBER}+${currentBuild.currentResult}"
				emailext attachLog: true,
				attachmentsPattern: '*/reports/serenity-reports.html',
				body: 'This is just test notification', 
				mimeType: 'text/html', 
				subject: 'This is just test notification', 
				to: 'himavanthkp@gmail.com'
			}
        }
    }
}
