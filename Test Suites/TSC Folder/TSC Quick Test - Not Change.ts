<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteCollectionEntity>
   <description></description>
   <name>TSC Quick Test - Not Change</name>
   <tag></tag>
   <delayBetweenInstances>0</delayBetweenInstances>
   <executionMode>PARALLEL</executionMode>
   <maxConcurrentInstances>8</maxConcurrentInstances>
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
  &quot;id&quot;: 1321,
  &quot;osDisplayName&quot;: &quot;Windows&quot;,
  &quot;browserName&quot;: &quot;msedge&quot;,
  &quot;browserDisplayName&quot;: &quot;Edge Chromium&quot;,
  &quot;browserVersion&quot;: &quot;143&quot;,
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
         <testSuiteEntity>Test Suites/Test Suite Folder/TS Quick Test - 03</testSuiteEntity>
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
  &quot;id&quot;: &quot;apple_iphone_17&quot;,
  &quot;isTablet&quot;: false,
  &quot;manufacturer&quot;: [
    &quot;Apple&quot;
  ],
  &quot;mobileDeviceId&quot;: &quot;iPhone_17_ios_26&quot;,
  &quot;name&quot;: &quot;Apple iPhone 17&quot;,
  &quot;displayName&quot;: &quot;Apple iPhone 17&quot;,
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
         <testSuiteEntity>Test Suites/Test Suite Folder/TS Quick Test - 02</testSuiteEntity>
      </TestSuiteRunConfiguration>
   </testSuiteRunConfigurations>
</TestSuiteCollectionEntity>
