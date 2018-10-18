##### poc - cucable-test-project with cucumber-picocontainer Support

```
mv clean verify
```


##### allure-reports is also supported with allure-cucumber3-jvm
ToDo: Causing errors need to look into it
Uncomment these in Pom.xml
```
<argLine>
	-javaagent:"${settings.localRepository}/org/aspectj/aspectjweaver/${aspectj.version}/aspectjweaver-${aspectj.version}.jar"
	-Dcucumber.options="--plugin io.qameta.allure.cucumber3jvm.AllureCucumber3Jvm"
</argLine>
```


##### Parallel execution can be controlled from
       <forkCount>5</forkCount>
       <reuseForks>true</reuseForks>