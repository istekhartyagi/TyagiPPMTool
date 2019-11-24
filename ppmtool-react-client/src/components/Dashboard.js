import React, { Component } from "react";
import ProjectItem from "./Project/ProjectItem";
import Header from "./Layout/Header";

export default class Dashboard extends Component {
  render() {
    return (
      <div>
        <Header />
        <h1>Welcome to traitor's Bastard Jon Snow!</h1>
        <ProjectItem />
      </div>
    );
  }
}
