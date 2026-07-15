// 根据后端接口生成前端请求和 TS 模型代码
// 后端先运行起来 再去package.json运行openapi2ts 这里要注意端口号8111 8123
// 有时候运行不成功是要下载 npm install tslib
export default {
  requestLibPath: "import request from '@/request'",
  schemaPath: 'http://localhost:8111/api/v3/api-docs',
  serversPath: './src',
}
