module.exports = {
  mode: "jit",
  content: ["./src/main/resources/templates/**/*.{html,js}"],
  theme: {
    extend: {},
  },
  plugins: [require("daisyui")],
}

//  prefix: "t-",
