 module.exports = {
   outputDir: "../src/main/resources/static",
   indexPath: "../static/index.html",
   devServer: {
        port: 5000,
        proxy: "http://localhost:8080"
        },
   chainWebpack: config => {
       const svgRule = config.module.rule("svg");
       svgRule.uses.clear();
       svgRule.use("vue-svg-loader").loader("vue-svg-loader")
       }
 };