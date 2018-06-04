return [

  version: 'v0.1.0',
  
  slackChannel: '#dev-enablement-devs',

  /*
   * (optional)
   * A closure with the unit test code.
   */
  unitTest: { scm ->
    node('java') {
      checkout scm
    //   sh 'mvn clean verify'
      sh 'mvn clean test-compile'
    }
  },

  /*
   * (optional)
   * A list of builds to trigger; these builds will be run in parallel.
   */
//   builds: ['api'],

  /*
   * (optional, required if `functionalTest` is defined)
   * Information about the Helm chart to install in the temporary test environment.
   * The sub-values are essentially arguments to `helm install`
   */
//   chart: [

//     /*
//      * (required)
//      * The name of a chart that exists in the TESLA chart repository
//      */
//     name: 'reststop',

//     /*
//      * (required)
//      * The chart version
//      */
//     version: '1.1.0',

//     /*
//      * (required)
//      * A closure that must return a map of values passed to Tiller for the chart installation.
//      * In other words, the map will be serialized to yaml and effectively passed to the `-f` flag of `helm install`.
//      * The closure is called with the branch name and environment name.  The former should be used to set the image tag,
//      * whereas the latter is used for any service or route name.
//      */
//     values: { branch, name ->
//       return [
//         "rest-simple-deploy": [
//           name: "api-${name}",
//           imageName: 'api',
//           trigger_tag: "${branch}"
//         ]
//       ]
//     }
//   ],

  /*
   * (optional)
   * A closure with the functional test code.
   */
   
//   functionalTest: { scm, name ->
//     node('python') {
//       checkout scm
//       try {
//         sh "bin/functional ${name}" // The name is passed so the test suite knows which route to hit.
//       } finally {
//         archiveArtifacts allowEmptyArchive: true, artifacts: 'logs/**/*.log'
//       }
//     }
//   }
  
]