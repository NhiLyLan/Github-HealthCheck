<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteCollectionEntity>
   <description></description>
   <name>RegressionTestCollection_With Release 01 02</name>
   <tag></tag>
   <delayBetweenInstances>0</delayBetweenInstances>
   <executionMode>PARALLEL</executionMode>
   <maxConcurrentInstances>1</maxConcurrentInstances>
   <testSuiteRunConfigurations>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>default</profileName>
            <requireConfigurationData>true</requireConfigurationData>
            <runConfigurationData>
               <entry>
                  <key>testCloudDesktopBrowser</key>
                  <value>{
  &quot;id&quot;: 567,
  &quot;osDisplayName&quot;: &quot;Windows&quot;,
  &quot;browserName&quot;: &quot;chrome&quot;,
  &quot;browserDisplayName&quot;: &quot;Chrome&quot;,
  &quot;browserVersion&quot;: &quot;135&quot;,
  &quot;browserVersionType&quot;: &quot;stable&quot;,
  &quot;os&quot;: &quot;windows&quot;,
  &quot;platformName&quot;: &quot;IOS&quot;,
  &quot;timeout&quot;: 15,
  &quot;usingTunnel&quot;: false,
  &quot;isHighAvailableDevice&quot;: false
}</value>
               </entry>
               <entry>
                  <key>testCloudSessionType</key>
                  <value>DESKTOP_BROWSER</value>
               </entry>
            </runConfigurationData>
            <runConfigurationId>TestCloud</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/Test Suite Folder/TS_RegressionTest_With TestOps Vision</testSuiteEntity>
      </TestSuiteRunConfiguration>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>default</profileName>
            <requireConfigurationData>true</requireConfigurationData>
            <runConfigurationData>
               <entry>
                  <key>testCloudMobileDevice</key>
                  <value>{
  &quot;capability&quot;: {
    &quot;availability&quot;: &quot;HIGH&quot;
  },
  &quot;id&quot;: &quot;any_ios_phone&quot;,
  &quot;isTablet&quot;: false,
  &quot;mobileDeviceId&quot;: &quot;any_ios_phone_26&quot;,
  &quot;name&quot;: &quot;Any iPhone&quot;,
  &quot;displayName&quot;: &quot;Any iPhone&quot;,
  &quot;osVersion&quot;: &quot;26&quot;,
  &quot;os&quot;: &quot;iOS&quot;,
  &quot;platformName&quot;: &quot;IOS&quot;,
  &quot;timeout&quot;: 15,
  &quot;usingTunnel&quot;: false,
  &quot;isHighAvailableDevice&quot;: true
}</value>
               </entry>
               <entry>
                  <key>testCloudSessionType</key>
                  <value>MOBILE_BROWSER</value>
               </entry>
            </runConfigurationData>
            <runConfigurationId>TestCloud</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/Test Suite Folder/TS_Verify test case TC3, TC4</testSuiteEntity>
      </TestSuiteRunConfiguration>
   </testSuiteRunConfigurations>
</TestSuiteCollectionEntity>
