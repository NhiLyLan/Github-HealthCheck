<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteCollectionEntity>
   <description></description>
   <name>TSC Quick Test</name>
   <tag></tag>
   <delayBetweenInstances>0</delayBetweenInstances>
   <executionMode>PARALLEL</executionMode>
   <maxConcurrentInstances>3</maxConcurrentInstances>
   <testSuiteRunConfigurations>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>profile 02</profileName>
            <requireConfigurationData>true</requireConfigurationData>
            <runConfigurationData>
               <entry>
                  <key>testCloudMobileDevice</key>
                  <value>{
  &quot;capability&quot;: {
    &quot;availability&quot;: &quot;HIGH&quot;
  },
  &quot;id&quot;: &quot;samsung_galaxy_s24&quot;,
  &quot;isTablet&quot;: false,
  &quot;manufacturer&quot;: [
    &quot;Samsung&quot;
  ],
  &quot;mobileDeviceId&quot;: &quot;Galaxy_S24_android_16&quot;,
  &quot;name&quot;: &quot;Samsung Galaxy S24&quot;,
  &quot;displayName&quot;: &quot;Samsung Galaxy S24&quot;,
  &quot;osVersion&quot;: &quot;16&quot;,
  &quot;os&quot;: &quot;Android&quot;,
  &quot;platformName&quot;: &quot;ANDROID&quot;,
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
         <testSuiteEntity>Test Suites/Test Suite Folder/TS Quick Test</testSuiteEntity>
      </TestSuiteRunConfiguration>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>profile 01</profileName>
            <requireConfigurationData>true</requireConfigurationData>
            <runConfigurationData>
               <entry>
                  <key>testCloudDesktopBrowser</key>
                  <value>{
  &quot;id&quot;: 1951,
  &quot;osDisplayName&quot;: &quot;Linux&quot;,
  &quot;browserName&quot;: &quot;firefox&quot;,
  &quot;browserDisplayName&quot;: &quot;Firefox&quot;,
  &quot;browserVersion&quot;: &quot;148&quot;,
  &quot;browserVersionType&quot;: &quot;stable&quot;,
  &quot;os&quot;: &quot;linux&quot;,
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
         <testSuiteEntity>Test Suites/Test Suite Folder/TS Quick Test</testSuiteEntity>
      </TestSuiteRunConfiguration>
   </testSuiteRunConfigurations>
</TestSuiteCollectionEntity>
