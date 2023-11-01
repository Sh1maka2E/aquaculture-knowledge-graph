## 项目简介
本课题内容为智慧水产养殖知识图谱的构建。通过收集水产养殖的数据，设计数据模式，构建知识图谱系统，展示三元组，描述水产实体之间的关系。

## 技术栈
### 前端
- Vue  
- ElementUI  
- axios  
- Echarts  
### 后端
- SpringBoot  
- Neo4j
## 部署方式
1. 在电脑上安装neo4j  
2. 导入项目  
3. 将doc中的`graph_backup.dump`文件放在neo4j安装路径的backup目录下，然后在neo4j安装路径的bin目录下通过cmd运行`neo4j-admin load --from=../backup/graph_backup.dump --database=graph.db --force`，将备份数据导入数据库  
4. 在neo4j的bin目录下通过cmd运行`neo4j console`命令，启动neo4j服务
5. 配置application.yaml中的neo4j数据库的账号和密码
6. 运行项目，访问`localhost:8080/knowledge-graph/page/home.html`  




